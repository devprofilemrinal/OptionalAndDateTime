package DateTime.code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperations {
    public static void printCurrentDateAndTime() {
        // Get the current date
        LocalDate onlyDate = LocalDate.now();
        // Get the current time
        LocalTime onlyTime = LocalTime.now();

        // Print the current date and time
        System.out.println("Current Date: " + onlyDate);  // e.g., 2019-02-24
        System.out.println("Current Time: " + onlyTime);  // e.g., 12:53:28.812637300
    }

    public static void dateAndTimeToLocalDateTime() {
        LocalDateTime ldt = LocalDateTime.of(2020, 4, 1, 12, 33, 21, 675);
        System.out.println("LocalDateTime from given data: " + ldt);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println("LocalDateTime from local date and local time: " + localDateTime);

        String localDateTimeString = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a"));
        System.out.println("String from localDateTime: " + localDateTimeString);
    }

    public static void main(String[] args) {

    }
}
