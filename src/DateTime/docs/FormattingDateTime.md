# Formatting date and Time
In order to define format patterns, the developer must be aware of the format pattern syntax. In
other words, the developer must be aware of the set of symbols that are used by the
Java date-time API in order to recognize a valid format pattern.

| Letter | Meaning            | Presentation    | Example                            |
|--------|--------------------|-----------------|------------------------------------|
| y      | year               | year            | 1994; 94                           |
| M      | month of year      | number/text     | 7; 07; Jul; July; J                |
| W      | week of month      | number          | 4                                  |
| E      | day of week        | text            | Tue; Tuesday; T                    |
| d      | day of month       | number          | 15                                 |
| H      | hour of day        | number          | 22                                 |
| m      | minute of hour     | number          | 34                                 |
| s      | second of minute   | number          | 55                                 |
| S      | fraction of second | number          | 345                                |
| z      | time zone name     | zone-name       | Pacific Standard Time; PST         |
| Z      | zone offset        | zone-offset     | -0800                              |
| V      | time zone id (JDK 8)| zone-id        | America/Los_Angeles; Z; -08:30     |

| Pattern                        | Example                             |
|---------------------------------|-------------------------------------|
| yyyy-MM-dd                      | 2019-02-24                          |
| MM-dd-yyyy                      | 02-24-2019                          |
| MMM-dd-yyyy                     | Feb-24-2019                         |
| dd-MM-yy                        | 24-02-19                            |
| dd.MM.yyyy                      | 24.02.2019                          |
| yyyy-MM-dd HH:mm:ss             | 2019-02-24 11:26:26                 |
| yyyy-MM-dd HH:mm:ssSSS          | 2019-02-24 11:36:32743              |
| yyyy-MM-dd HH:mm:ssZ            | 2019-02-24 11:40:35+0200            |
| yyyy-MM-dd HH:mm:ss z           | 2019-02-24 11:45:03 EET             |
| E MMM yyyy HH:mm:ss.SSSZ        | Sun Feb 2019 11:46:32.393+0200      |
| yyyy-MM-dd HH:mm:ss VV (JDK 8)  | 2019-02-24 11:45:41 Europe/Athens   |

Starting with JDK 8, a format pattern can be applied with `DateTimeFormatter`/
