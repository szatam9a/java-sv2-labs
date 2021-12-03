package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BusTimeTableTest {

    @Test
    void onCreate(){
        BusTimeTable timeTable = new BusTimeTable(10,12,50);
        assertEquals(3,timeTable.getTimeTable().size());
    }

    @Test
    void getTimeTableTest() {
        BusTimeTable timetable = new BusTimeTable(Arrays.asList(
                new SimpleTime(9, 15),
                new SimpleTime(12, 45),
                new SimpleTime(14, 15)));
        assertEquals(3, timetable.getTimeTable().size());
    }

    @Test
    void getNextBusTest() {
        BusTimeTable timetable = new BusTimeTable(Arrays.asList(
                new SimpleTime(9, 15),
                new SimpleTime(12, 45),
                new SimpleTime(14, 15)));
        assertEquals("14:15", timetable.getNextBus(new SimpleTime(13, 15)).toString());
    }
    @Test
    void nextBusShouldThrowExceptionIfNone() {
        BusTimeTable timetable = new BusTimeTable(Arrays.asList(
                new SimpleTime(9, 15),
                new SimpleTime(12, 45),
                new SimpleTime(14, 15)));
        IllegalStateException ex = assertThrows(IllegalStateException.class, () -> {
            timetable.getNextBus(new SimpleTime(18, 16));
        });
        assertEquals("NO MORE BUSS TODAY", ex.getMessage());
    }
}