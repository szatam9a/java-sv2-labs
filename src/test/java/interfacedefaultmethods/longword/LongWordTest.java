package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void getLongWordTest() {
        assertEquals("LONGWORD", new LongWord().getLongWord());
    }
}