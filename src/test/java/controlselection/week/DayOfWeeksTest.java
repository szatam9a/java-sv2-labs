package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {
    @Test
    void invalidDay(){
        assertEquals("ismeretlen nap",new DayOfWeeks().theDayToday("mivanma"));
    }
    @Test
    void testEveryPossibility() {
        assertEquals("hét eleje", new DayOfWeeks().theDayToday("hétfő"));
        assertEquals("hét közepe", new DayOfWeeks().theDayToday("szerda"));
        assertEquals("majdnem hétvége", new DayOfWeeks().theDayToday("péntek"));
        assertEquals("hét vége", new DayOfWeeks().theDayToday("vasárnap"));
    }
}