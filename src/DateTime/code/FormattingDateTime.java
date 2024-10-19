package DateTime.code;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {
    public static void main(String[] args) {
        //For LocalDate (date without a time zone in the ISO-8601 calendar system):
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatterLocalDate
                = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String stringLD = formatterLocalDate.format(localDate);
        System.out.println("Local Date in yyyy--MM-dd :" + stringLD);

        String stringLD2 = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
