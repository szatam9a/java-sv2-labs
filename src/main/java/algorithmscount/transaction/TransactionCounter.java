package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int transactionCounter(List<Transaction> list, int limit) {
        int sum = 0;
        for (Transaction t : list
        ) {
            if (t.isCredit() && (t.getAmount() < limit)) {
                sum++;
            }
        }
        return sum;
    }
}
