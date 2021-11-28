package algorithmsmax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void getLongestOceanTest() {
        Plane plane = new Plane();
        String map =" 100000001111100000000000011111111110000100000100001000001111111100001010000" +
                "00000111110000000000000000100000001000000000000111111000000000100000000000011";
        int solution = plane.getLongestOcean(map);
        assertEquals(16,solution);
    }
}