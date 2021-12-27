package algorithmscount.bankaccount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountConditionCounterTest {

    @Test
    void countBalanceOver() {
        BankAccountConditionCounter bankAC = new BankAccountConditionCounter();
        List<BankAccount> list = Arrays.asList(
                new BankAccount("a", "1", 10),
                new BankAccount("a", "2", 16),
                new BankAccount("a", "3", 20)
        );
        int toTest = bankAC.countBalanceOver(list, 15);
        assertEquals(2,toTest);
    }
}