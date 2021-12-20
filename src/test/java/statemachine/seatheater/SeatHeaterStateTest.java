package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void stateTest() {

        SeatHeaterState state = SeatHeaterState.OFF;

        assertEquals(SeatHeaterState.OFF, state);
        assertEquals(SeatHeaterState.HIGH,state.next());
    }
}