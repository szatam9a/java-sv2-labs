package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void CAPSLOCKTest() {
        TypeWriterState type = TypeWriterState.ON;

        assertEquals(TypeWriterState.ON,type);
        assertEquals(TypeWriterState.OFF,type.CAPSLOCK());

    }
}