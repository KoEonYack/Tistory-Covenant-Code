import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

    @Test
    public void LocalDateTime_NOW() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
    }

    @Test
    public void LocalDateTime_NOW_CLOCK() {
        LocalDateTime now = LocalDateTime.now(Clock.systemDefaultZone());
        System.out.println("now = " + now);
    }

    @Test
    public void LocalDateTime_NOW_ZONE_ID() {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("now = " + now);
    }


    @Test
    public void LocalDateTime_Of() {
        LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        System.out.println("localDateTime = " + localDateTime);
    }

    @Test
    public void LocalDateTime_format_1() {
        // localDateTime: 2021년 1월 1일 0시 0분 0초
        LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        String localDateTimeFormat1 = localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
        String localDateTimeFormat2 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS"));

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTimeFormat1 = " + localDateTimeFormat1);
        System.out.println("localDateTimeFormat2 = " + localDateTimeFormat2);
    }

    @Test
    public void LocalDateTime_format_2() {
        // localDateTime: 2021년 1월 1일 0시 0분 0초
        LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        String localDateTimeFormat = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTimeFormat = " + localDateTimeFormat);
    }

    @Test
    public void LocalDateTime_parse() {
        String stringTime = "2021-01-01 11:11:00";
        System.out.println(LocalDateTime.parse(stringTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
    
    @Test 
    public void LocalDateTime_get_1() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("getYear() = " + now.getYear());
        System.out.println("getMonth() = " + now.getMonth());
        System.out.println("getDayOfMonth() = " + now.getDayOfMonth());
        System.out.println("getDayOfWeek() = " + now.getDayOfWeek());
        System.out.println("getDayOfYear() = " + now.getDayOfYear());
    }

    @Test
    public void LocalDateTime_get_2() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("getHour() = " + now.getHour());
        System.out.println("getMinute() = " + now.getMinute());
        System.out.println("getSecond() = " + now.getSecond());
        System.out.println("getNano() = " + now.getNano());
    }

    @Test
    public void LocalDateTime_calculate_plus() {
        LocalDateTime now = LocalDateTime.of(2021, 9, 9, 10, 0, 0);
        System.out.println("plusDays(3) = " + now.plusDays(3));
        System.out.println("plusMonths(3) = " + now.plusMonths(3));
        System.out.println("plusYears(3) = " + now.plusYears(3));
        System.out.println("plusHours(3) = " + now.plusHours(3));
        System.out.println("plusMinutes(3) = " + now.plusMinutes(3));
        System.out.println("plusSeconds(3) = " + now.plusSeconds(3));
    }

    @Test
    public void LocalDateTime_calculate_minus() {
        LocalDateTime now = LocalDateTime.of(2021, 9, 9, 10, 0, 0);
        System.out.println("minusDays(3) = " + now.minusDays(3));
        System.out.println("minusMonths(3) = " + now.minusMonths(3));
        System.out.println("minusYears(3) = " + now.minusYears(3));
        System.out.println("minusHours(3) = " + now.minusHours(3));
        System.out.println("minusMinutes(3) = " + now.minusMinutes(3));
        System.out.println("minusSeconds(3) = " + now.minusSeconds(3));
    }

    @Test
    public void LocalDateTime_compare() {
        // 2021년 1월 1일 0시 0분 0초
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        // 2023년 1월 1일 0시 0분 0초
        LocalDateTime localDateTime3 = LocalDateTime.of(2023, 1, 1, 0, 0, 0);

        if (localDateTime1.isBefore(localDateTime3)) {
            System.out.println("localDateTime1 is before localDateTime3");
        }

        if (localDateTime3.isAfter(localDateTime1)) {
            System.out.println("localDateTime3 is after localDateTime1");
        }

        if (localDateTime1.isEqual(localDateTime2)) {
            System.out.println("localDateTime1 is equal to localDateTime2");
        }

        if (localDateTime1.compareTo(localDateTime2) == 0) {
            System.out.println("localDateTime1 is equal to localDateTime2");
        }
    }

    @Test
    public void LocalDateTime_convert_LocalDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
    }
}
