package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void sumTest() {
        SeparatedSum ss = new SeparatedSum();
        ss.sum("2;3;-5;-10");
        assertEquals(5,      ss.sum("2;3;-5;-10").getPositive());
        assertEquals(-15,      ss.sum("2;3;-5;-10").getNegative());

    }
}