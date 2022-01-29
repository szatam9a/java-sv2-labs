package lambda;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemainderTest {

    @Test
    void changeNumbersToRemaindersTest() {
        Remainder remainder = new Remainder();
        List<Integer> toTest = List.of(45, 13, 64, 51, 92, 33);
        List<Integer> control = List.of(0, 1, 1, 0, 2, 0);
        List<Integer> toWrite = remainder.changeNumbersToRemainders(toTest, 3);
        assertEquals(control, toWrite);
    }
}