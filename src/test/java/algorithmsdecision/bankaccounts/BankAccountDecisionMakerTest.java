package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void containsBalanceGreaterThanTest() {
        BankAccountDecisionMaker bad = new BankAccountDecisionMaker();
        List<BankAccount> toTest = Arrays.asList(
                new BankAccount("a","a",1),
                new BankAccount("a","a",3),
                new BankAccount("a","a",10),
                new BankAccount("a","a",20),
                new BankAccount("a","a",1)
        );
        assertTrue(bad.containsBalanceGreaterThan(toTest,10));
        assertFalse(bad.containsBalanceGreaterThan(toTest,20));
    }
}