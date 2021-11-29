package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test
    void onCreateTest(){
        IllegalArgumentException emptyAddress =assertThrows(IllegalArgumentException.class,()-> new Monument("a","", LocalDate.now(),"regnumber"));
        assertEquals("Name, address or registry number cannot be empty!",emptyAddress.getMessage());

        IllegalArgumentException emptyReg =assertThrows(IllegalArgumentException.class,()-> new Monument("a","a", LocalDate.now(),""));
        assertEquals("Name, address or registry number cannot be empty!",emptyReg.getMessage());

        IllegalArgumentException emptyName =assertThrows(IllegalArgumentException.class,()-> new Monument("","a", LocalDate.now(),"regnumber"));
        assertEquals("Name, address or registry number cannot be empty!",emptyName.getMessage());
    }
}