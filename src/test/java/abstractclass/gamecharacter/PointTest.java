package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void distanceTest(){
        Point pont = new Point(0,0);
        pont.distance(new Point(0,1));
        assertEquals(1,pont.distance(new Point(0,1)));
        assertEquals(100,pont.distance(new Point(100,0)));
        assertEquals(100,pont.distance(new Point(0,100)));
        assertEquals(4,pont.distance(new Point(2,3)));

    }
}