## Convert String To Date and Time
 ### Before JDK 8
Before JDK 8, the typical solution to this problem relies on the main extension of the
abstract DateFormat class, named SimpleDateFormat (this is not a thread-safe
class)

### Starting with JDK 8
Starting with JDK 8, SimpleDateFormat can be replaced with a new
class—DateTimeFormatter. This is an immutable (and, therefore, thread-safe) class,
and is used for printing and parsing date-time objects. This class supports everything
from predefined formatters (represented as constants, as the ISO local date,
2011-12-03, is ISO_LOCAL_DATE) to user-defined formatters (relying on a set of
symbols for writing custom format patterns).

Moreover, beside the Date class, JDK 8 comes with several new classes, which are
dedicated to working with date and time. Some of these classes are shown in the
following list (these are also referenced as temporals because they implement the
Temporal interface):
- LocalDate (date without a time zone in the ISO-8601 calendar system)
- LocalTime (time without a time zone in the ISO-8601 calendar system)
- LocalDateTime (date-time without a time zone in the ISO-8601 calendar
  system)
- ZonedDateTime (date-time with a time zone in the ISO-8601 calendar
  system), and so on
- OffsetDateTime (date-time with an offset from UTC/GMT in the
  ISO-8601 calendar system)
  OffsetTi