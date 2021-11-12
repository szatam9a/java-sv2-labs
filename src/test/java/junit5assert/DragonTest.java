package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    Dragon dragon = new Dragon("Jhon",7,10.9);
    @Test
    void testName(){
        assertEquals("Jhon",dragon.getName());
        assertNotEquals("Jhoney",dragon);
    }
    @Test
    void testNumberOfHeads(){
        assertEquals(7,dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads()>6);
        assertFalse(dragon.getNumberOfHeads()<6);
    }
    @Test
    void testHeight(){
        assertEquals(10.9,dragon.getHeight(), 0.0005);
    }
    @Test
    void testNull(){
        Dragon dragonNull = null;
        Dragon dragonNotNull = new Dragon("Katey",7,7);
        assertNull(dragonNull);
        assertNotNull(dragonNotNull);
    }
    @Test
    void testSameObject(){
        Dragon dragey = new Dragon("Okey",1,1);
        Dragon friend = dragey;
        assertSame(dragey,friend);
    }

}
