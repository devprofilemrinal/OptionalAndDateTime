package DateTime.code;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriodDefiner {
    public static void main(String[] args) {
        Period period = Period.ofDays(120);
        System.out.println("Period of 120 days: " + period);

        Period periodFromUnits = Period.of(2000, 11,21);
        System.out.println("Period of 2000 days: " + periodFromUnits);

        LocalDate localDate = LocalDate.now();
        Period periodFromLocalDate = Period.of(localDate.getYear(),
                localDate.getMonthValue(), localDate.getDayOfMonth());

        System.out.println("period from local date:" + periodFromLocalDate);

        LocalDate startLocalDate = LocalDate.of(2018, 3, 12);
        LocalDate endLocalDate = LocalDate.of(2019, 7, 20);
        Period periodBetween = Period.between(startLocalDate, endLocalDate);
        System.out.println("period between dates:" + periodBetween);
    }
}
