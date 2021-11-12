package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    Ship ship;
    @BeforeEach
    void init(){
        ship = new Ship("Jhoney",1990,10);
    }
    @Test
    void testName(){
        assertEquals("Jhoney",ship.getName());
    }
    @Test
    void testYearOfConstruction(){
        assertEquals(1990,ship.getYearOfConstruction());
    }
    @Test
    void testLength(){
        assertEquals(10,ship.getLength(),0.0005);
    }
    @Test
    void testNull(){
        Ship djhoney = null;
        assertNull(djhoney);
        assertNotNull(ship);
    }
    @Test
    void testSameObject(){
        Ship copyShip = ship;
        assertSame(ship,copyShip);
    }
    @Test
    void testNotSameObjects(){
        Ship anotherShip = new Ship("Jhoney",1990,10);
        assertNotSame(ship,anotherShip);
    }

}