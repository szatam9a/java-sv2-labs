package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void getSideTest() {
        TableCloth tc = new TableCloth(3);
        assertEquals(3,tc.getSide());
        assertEquals(12, tc.getPerimeter());
    }
}