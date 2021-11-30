package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumedTest {

    @Test
    void addANumberTest() {
        Sumed sumed = new Sumed();
        sumed.addANumber(10);
        sumed.addANumber(-10);
        assertEquals(10,sumed.getPositive());
        assertEquals(-10,sumed.getNegative());
    }
}