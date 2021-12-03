package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    @Test
    void formatDateStringTest() {
        SimpleDateFormatter sdf = new SimpleDateFormatter();
        assertEquals("10-12-1990", sdf.formatDateString(new SimpleDate().setDate(1990, 12, 10)));
    }

    @Test
    void formatDateStringByCountryCodeTest() {
        SimpleDateFormatter sdf = new SimpleDateFormatter();
        assertEquals(10 - 12 - 1990, sdf.formatDateStringByCountryCode(CountryCode.EN, new SimpleDate().setDate(1990, 12, 10)));
    }
}