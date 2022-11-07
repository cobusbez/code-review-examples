package codesmells.exceptionhandling;

import java.time.LocalDate;

public class ExceptionHandling {
    public static LocalDate localDateOrNull(Object sqlDateObject) {
        if (sqlDateObject == null) {
            return null;
        }
        try {
            return ((java.sql.Date) sqlDateObject).toLocalDate();
        } catch (Exception e) {
//            when catching a generic "Exception e", please ensure to print the stacktrace or at least the root cause of the exception… you never know what will be useful when debugging an issue in production
            return null;
        }
    }
}
