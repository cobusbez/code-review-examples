package codesmells.doublenegative.before;

public class DoubleNegative {
    public InvocationResult<PathologyReport> validate() {
        InvocationResult<PathologyReport> result = new InvocationResult<>(this);
        boolean noPatient = false;
        if (!new PracticeNumber(practiceNumber).isValid()) {
            result.add(new InputValidationException("Invalid practice number [" + practiceNumber + "]"));
        }
        if (Strings.isNullOrEmpty(getPatientSAIDNumber()) && Strings.isNullOrEmpty(getPatientPassportNumber())) {
            noPatient = true;
        } else if (getPatientIdentification().getType().equals(PatientIdentification.Type.INVALID)) {
            result.add(new InputValidationException(String.format("Invalid patient identification ID number [%s] or passport [%s] - Source: %s", patientSAIDNumber, patientPassportNumber, sourceSystem)));
        }
        if (!noPatient && (patientFirstname == null || patientFirstname.trim().isEmpty() || patientLastname == null || patientLastname.trim().isEmpty())) {
            result.add(new InputValidationException("Missing patient names [" + patientFirstname + " " + patientLastname + "]"));
        }
        if (!noPatient && (patientEmail == null || patientEmail.trim().isEmpty())) {
            patientEmail = Email.DRAFT_PATIENT_EMAIL;
        }
        if (sourceSystem == null || sourceSystem.trim().isEmpty()) {
            result.add(new InputValidationException("Invalid source system [" + sourceSystem + "]"));
        }
        if (reportMimeType == null || reportMimeType.trim().isEmpty() || !reportMimeType.equalsIgnoreCase("application/pdf")) {
            result.add(new InputValidationException("Unsupported mimetype [" + reportMimeType + "]"));
        }
        if (reportPayload == null || reportPayload.trim().isEmpty()) {
            result.add(new InputValidationException("Invalid report payload"));
        }
        return result;
    }

}
