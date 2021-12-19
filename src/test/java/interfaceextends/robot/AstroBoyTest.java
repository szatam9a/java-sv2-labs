package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AstroBoyTest {

    @Test
    void walkToTest() {
        AstroBoy astroBoy = new AstroBoy(new Point(0, 0, 0));
        Point targetPoint = new Point(12L, 23L, 0);
        astroBoy.fastMoveTo(targetPoint);
        assertEquals(targetPoint.getX(), astroBoy.getPosition().getX());
    }
}