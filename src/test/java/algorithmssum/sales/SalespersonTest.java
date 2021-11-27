package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void constructTest(){
        Salesperson salesperson = new Salesperson("Name",1);
        assertEquals("Name", salesperson.getName());
        assertEquals(1, salesperson.getAmount());
    }
}