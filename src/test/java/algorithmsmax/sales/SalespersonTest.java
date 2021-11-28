package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {
    @Test
    void onCreate(){
        Salesperson salesperson = new Salesperson("a",1,1);
        assertEquals("a",salesperson.getName());
        assertEquals(1,salesperson.getAmount());
        assertEquals(1,salesperson.getTarget());
    }

}