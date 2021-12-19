package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    @Test
    void getPayableAmountTest() {
        Cash cash= new Cash();
        assertEquals(100,cash.getPayableAmount(101));
        assertEquals(100,cash.getPayableAmount(100));
        assertEquals(100,cash.getPayableAmount(102));
        assertEquals(100,cash.getPayableAmount(99));
        assertEquals(100,cash.getPayableAmount(98));
        assertEquals(105,cash.getPayableAmount(106));
        assertEquals(105,cash.getPayableAmount(104));
        assertEquals(105,cash.getPayableAmount(105));
        assertEquals(105,cash.getPayableAmount(107));
        assertEquals(110,cash.getPayableAmount(110));


    }
}