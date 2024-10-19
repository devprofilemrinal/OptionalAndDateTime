package DateTime.code;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ZoneDemo {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
    }
}

class DateTimes {

    public enum OffsetType {
        GMT
    }

    // Helper method to fetch time zones with UTC offsets
    public static List<String> fetchTimeZones(OffsetType type) {
        List<String> timezones = new ArrayList<>();
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();  // Get all available time zone IDs
        LocalDateTime now = LocalDateTime.now();  // Current reference date-time

        // For each zone ID, create ZoneId and get UTC offset
        zoneIds.forEach((zoneId) -> {
            ZonedDateTime zdt = now.atZone(ZoneId.of(zoneId));  // Convert LocalDateTime to ZonedDateTime
            String utcOffset = zdt.getOffset().getId().replace("Z", "+00:00");  // Get and format UTC offset
            timezones.add("(" + type + utcOffset + ") " + zoneId);  // Add formatted time zone with offset
        });

        return timezones;
    }

    public static void main(String[] args) {
        // Fetch time zones with GMT offsets and sort them
        List<String> timezones = DateTimes.fetchTimeZones(OffsetType.GMT);
        Collections.sort(timezones);  // Optional sorting

        // Print the sorted time zones
        timezones.forEach(System.out::println);
    }
}
