package DateTime.code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CustomFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter
                = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateFormatted
                = LocalDate.parse("01.06.2020", dateFormatter);

        System.out.println("local Date formatted : " + localDateFormatted);

        DateTimeFormatter timeFormatter
                = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTimeFormatted
                = LocalTime.parse("12|23|44", timeFormatter);

        DateTimeFormatter dateTimeFormatter
                = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");

        LocalDateTime localDateTimeFormatted
                = LocalDateTime.parse("01.06.2020, 11:20:15", dateTimeFormatter);

        DateTimeFormatter zonedDateTimeFormatter
                = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ssXXXXX '['VV']'");
        ZonedDateTime zonedDateTimeFormatted
                = ZonedDateTime.parse("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]",
                zonedDateTimeFormatter);
    }
}
