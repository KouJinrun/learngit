package TimeTest;

import java.time.*;

public class TimeTest {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2022, 3, 1, 0, 0, 0);
        long l = ldt.toEpochSecond(ZoneOffset.of("+8"));
        LocalDateTime ldt1 = LocalDateTime.of(2022, 4, 1, 0, 0, 0);
        ZonedDateTime zdt = ldt1.atZone(ZoneId.systemDefault());
        long l1 = zdt.toEpochSecond();
        System.out.println(l + "\n" + l1);
    }
}
