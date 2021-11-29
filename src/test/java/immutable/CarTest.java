package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void onCreateTest(){
        IllegalArgumentException future =assertThrows(IllegalArgumentException.class,()-> new Car("A","okey",2030));
        assertEquals("The product was made in future",future.getMessage());

        IllegalArgumentException brandempty =assertThrows(IllegalArgumentException.class,()-> new Car("","okey",1990));
        assertEquals("Brand cant be empty",brandempty.getMessage());

   IllegalArgumentException brandnull =assertThrows(IllegalArgumentException.class,()-> new Car(null,"okey",1990));
        assertEquals("Brand cant be empty",brandnull.getMessage());

        Car car = new Car("a","a",1);
        assertEquals("a",car.getBrand());
        assertEquals("a",car.getType());
        assertEquals(1,car.getYearOfProduct());
    }

}