package codesmells.drycode.after;

import java.util.Optional;

/**
 * Say we have an object which handles a file name, but the file name may contain invalid characters.
 * Cleaning up the file name before assigning it would be a good idea.
 */
public class AvoidingDuplicatedLogicInPOJOS {
    private String fileName;

    public AvoidingDuplicatedLogicInPOJOS(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    /**
     * Explicit getter that places the sanitization in a central method without 'side effects'
     * This allows to always get the 'original' file name if needed during processing, and it eliminates duplicated code and makes the usage very explicit.
     */
    public String getFileNameSanitized() {
        return fileName == null ? null : fileName.replaceAll(Character.toString((char) 65533), "_");
    }

    /**
     * The file name is only cleaned in the constructor.
     * We could move the logic here and then call the setter from the constructor
     * We still run the risk of someone creating a new mutations on the file name which may be missed.
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
