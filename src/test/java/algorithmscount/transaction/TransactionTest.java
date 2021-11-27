package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void onCreate(){
        Transaction transaction = new Transaction("1",TransactionType.DEBIT,1);
        assertEquals("1",transaction.getAccountNumber());
        assertEquals(1,transaction.getAmount());
        assertEquals(TransactionType.DEBIT,transaction.getTransactionType());
    }
}