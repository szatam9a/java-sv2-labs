package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void transactionCounter() {
        TransactionCounter tc = new TransactionCounter();
        List<Transaction> listOfT = Arrays.asList(
                new Transaction("a",TransactionType.DEBIT,10),
                new Transaction("b",TransactionType.CREDIT,10),
                new Transaction("c",TransactionType.CREDIT,20),
                new Transaction("d",TransactionType.CREDIT,30)
        );
        int toTest= tc.transactionCounter(listOfT,20);
        assertEquals(1,toTest);
    }
}