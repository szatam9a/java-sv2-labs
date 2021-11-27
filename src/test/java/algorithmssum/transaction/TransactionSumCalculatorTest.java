package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void sumAmountOfCreditEntriesTest() {
        TransactionSumCalculator calculator = new TransactionSumCalculator();
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1234-2345-1231", TransactionOperation.CREDIT, 100),
                new Transaction("1234-2345-1231", TransactionOperation.CREDIT, 100),
                new Transaction("1234-2345-1231", TransactionOperation.DEBIT, 500)
        );
        assertEquals(200, calculator.sumAmountOfCreditEntries(transactions));
    }
}
