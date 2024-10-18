package DateTime.code;

import java.time.*;
import java.time.chrono.IsoEra;

public class DateTimeDemo {
    public static void convertStringToDateAndTime(){
        LocalDate localDate = LocalDate.parse("2020-06-01");
        int dayOfMonth = localDate.getDayOfMonth();
        boolean leapYear = localDate.isLeapYear();
        IsoEra era = localDate.getEra();
        System.out.println("localDate: " + localDate
        + ", day of month: " + dayOfMonth
        + ", leap year: " + leapYear
        + ", era: " + era);

        System.out.println("----------------------------");
        LocalTime localTime = LocalTime.parse("12:23:44");
        System.out.println(localTime);
        System.out.println(LocalTime.now());

        System.out.println("-----------LocalDateTime-------------");
        LocalDateTime localDateTime
                = LocalDateTime.parse("2020-06-01T11:20:15");

        System.out.println("local date time : " + localDateTime);

        ZonedDateTime zonedDateTime
                = ZonedDateTime.parse("2020-06-01T10:15:30+09:00[Asia/Tokyo]");

        System.out.println("zoned date time : " + zonedDateTime);

        OffsetDateTime offsetDateTime
                = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");

        System.out.println("offset date time : " + offsetDateTime);
    }

    public static void main(String[] args) {
        convertStringToDateAndTime();
    }
}
