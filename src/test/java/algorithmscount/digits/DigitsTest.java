package algorithmscount.digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {

    @Test
    void getCounterOfNumbersTest() {
        Digits digits = new Digits();

        assertEquals(9,digits.getCounterOfNumbers());
    }
}