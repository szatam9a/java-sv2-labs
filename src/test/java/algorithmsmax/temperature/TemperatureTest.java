package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void getMinTest() {
        Temperature temperature = new Temperature();
        int toTest = temperature.getMin(Arrays.asList(1,2,3,4,5,6,7,8,9));
        assertEquals(1,toTest);
    }
}