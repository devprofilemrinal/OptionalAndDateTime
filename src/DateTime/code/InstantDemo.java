package DateTime.code;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantDemo {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        //similar output
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println("zone offset instant: " + now);

        // Clock output
        Clock clock = Clock.systemUTC();
        System.out.println("clock instant: " + clock.instant());

        //some opeartions
        Instant.now().plus(2, ChronoUnit.HOURS);
        Instant.now()
                .minus(10, ChronoUnit.MINUTES);

        Instant timestamp1 = Instant.now();
        Instant timestamp2 = timestamp1.plusSeconds(10);
        timestamp1.isAfter(timestamp2);
        timestamp1.isBefore(timestamp2);
        timestamp1.until(timestamp2, ChronoUnit.SECONDS);

        //conversions
        LocalDateTime ldt = LocalDateTime.ofInstant(
                Instant.now(), ZoneOffset.UTC);

        Instant instantLDT =
                LocalDateTime.now().toInstant(ZoneOffset.UTC);

        ZonedDateTime zdt =
                Instant.now().atZone(ZoneId.of("Europe/Paris"));

        Instant instantZDT = LocalDateTime.now()
                .atZone(ZoneId.of("Europe/Paris")).toInstant();
    }
}
