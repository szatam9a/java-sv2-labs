package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {

        Performance performance = new Performance(LocalDate.of(2015, 1, 20), "Bonjovi", LocalTime.of(10, 15), LocalTime.of(11,00));
        System.out.println(performance.getInfo());
    }
}
