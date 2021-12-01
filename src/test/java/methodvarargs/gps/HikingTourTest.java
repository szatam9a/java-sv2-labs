package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    @Test
    void logFieldPointsTest() {
        HikingTour ht = new HikingTour();
        ht.logFieldPoints(LocalDateTime.now(),
                new FieldPoint(LocalDateTime.now(),1,1),
                new FieldPoint(LocalDateTime.now(),1,1),
                new FieldPoint(LocalDateTime.now(),1,1),
                new FieldPoint(LocalDateTime.now(),1,1)
        );
        assertEquals(4,ht.getFieldPointList().size());
    }
    void logFieldPointsWithNullTimeTest(){
        HikingTour ht = new HikingTour();
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                ()-> ht.logFieldPoints( null,
                        new FieldPoint(LocalDateTime.now(),1,1)));
        assertEquals("The time of logging is null!",ex.getMessage());
    }
}