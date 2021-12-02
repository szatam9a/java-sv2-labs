package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void isEqualTest() {
        assertTrue(new Time(1,1,1).isEqual(1,1,1));
        assertTrue(new Time(1,1,1).isEarlier(1,1,0));
    }
}