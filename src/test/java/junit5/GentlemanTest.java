package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {
    @Test
    void testSayHello(){
        Gentleman gm = new Gentleman();
        assertEquals("Hello Jhon Doe", gm.sayHello("Jhon Doe"));
    }
}
