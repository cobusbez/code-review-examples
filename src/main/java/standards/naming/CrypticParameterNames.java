package standards.naming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class CrypticParameterNames {
    private static final Logger log = LoggerFactory.getLogger(CrypticParameterNames.class);

    public static LocalDate localDateOrNull(Object sqlDateObject) {
        if (sqlDateObject == null) {
            return null;
        }
        try {
            return ((java.sql.Date) sqlDateObject).toLocalDate();
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            return null;
        }
    }
}
