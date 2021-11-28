package algorithmsmax.hill;

import algorithmsmax.temperature.Temperature;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void getMaxTest() {
        Hill hill = new Hill();
        int toTest = hill.getMax(Arrays.asList(1,2,3,4,5,6,7,8,9));
        assertEquals(9,toTest);
    }
}