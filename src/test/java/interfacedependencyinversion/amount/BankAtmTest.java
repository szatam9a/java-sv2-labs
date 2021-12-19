package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAtmTest {

    @Test
    void getPayableAmountTest() {
        BankAtm atm = new BankAtm();
        assertEquals(2000,atm.getPayableAmount(2300));
        assertEquals(2000,atm.getPayableAmount(1800));
        assertEquals(3000,atm.getPayableAmount(2500));
        assertEquals(2000,atm.getPayableAmount(2499));
    }
}