package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    @Test
    public void testPossibleMovement() {
        Tank tank = new Tank();
        tank.setAngle(10);
        tank.modifyAngle(20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testImpossibleMovement() {
        Tank tank = new Tank();
        tank.setAngle(80);
        tank.modifyAngle(90);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testImpossibleMovementRule() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("a tank 80fokot képes fordulni jobbra és ballra is.");
        Tank tank = new Tank();
        tank.setAngle(80);
        tank.modifyAngle(90);
    }

    @Test
    public void testImpossibleMovementThrow() {
        Tank tank = new Tank();
        tank.setAngle(80);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(90));
        assertEquals("a tank 80fokot képes fordulni jobbra és ballra is.", exception.getMessage());
    }

}