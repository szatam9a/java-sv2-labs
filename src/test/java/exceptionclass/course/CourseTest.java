package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;
    @Test
    void testToStringTest() {
        course = new Course("Course", new SimpleTime(12,10));
        assertEquals("12:10 Course", course.toString());
    }

    @Test
    void invalidHourTest() {
        InvalideTimeException ite= assertThrows(InvalideTimeException.class, ()-> new SimpleTime(24,10));
        assertEquals("Hour is invalid (0-23)",ite.getMessage());
        ite= assertThrows(InvalideTimeException.class, ()-> new SimpleTime("okey","10"));
        assertEquals("Time is not hh:mm",ite.getMessage());
        ite= assertThrows(InvalideTimeException.class, ()-> new SimpleTime(null,"10"));
        assertEquals("Time is null",ite.getMessage());
    }

    @Test
    void invalidMinuteTest() {
        InvalideTimeException ite= assertThrows(InvalideTimeException.class, ()-> new SimpleTime(23,100));
        assertEquals("Minute is invalid (0-59)",ite.getMessage());
        ite= assertThrows(InvalideTimeException.class, ()-> new SimpleTime("10","okey"));
        assertEquals("Time is not hh:mm",ite.getMessage());
        ite= assertThrows(InvalideTimeException.class, ()-> new SimpleTime("12",null));
        assertEquals("Time is null",ite.getMessage());
    }
}