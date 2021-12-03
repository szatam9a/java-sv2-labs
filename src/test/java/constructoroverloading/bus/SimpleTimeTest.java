package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void getDifferenceTest() {
        assertEquals(10,new SimpleTime(10,10).getDifference(new SimpleTime(10,0)));
    }
}