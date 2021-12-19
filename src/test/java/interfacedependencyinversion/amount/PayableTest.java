package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void getPayableAmountTest() {
        Payable payable = new Amount();
        Payable payable1 = new Cash();
        Payable payable2 = new BankAtm();
        assertEquals(10,payable.getPayableAmount(10));
        assertEquals(105,payable1.getPayableAmount(103));
        assertEquals(0,payable2.getPayableAmount(10));

    }
}