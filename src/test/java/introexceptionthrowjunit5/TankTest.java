package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TankTest {
    @Test
    void testPossibleMovement(){
        Tank tank = new Tank();
        tank.setAngle(10);
        tank.modifyAngle(30);
        assertEquals(40, tank.getAngle());
    }

    @Test
     void testImpossibleMovementThrow() {
        Tank tank = new Tank();
        tank.setAngle(80);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(90));
        assertEquals("a tank 80fokot képes fordulni jobbra és ballra is.", exception.getMessage());
    }
}