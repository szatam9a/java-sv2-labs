package staticattrmeth.bank;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;
    private long transactionValue;

    public BankTransaction(long transactionValue) {
        if (transactionValue < MIN_TRANSACTION_VALUE || transactionValue > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("the value is not in between the limits");
        }
        this.transactionValue=transactionValue;
        countOfTransactions++;
        sumOfTransactions += transactionValue;
        currentMaxValue = currentMaxValue > transactionValue ? currentMaxValue : transactionValue;
        currentMinValue = currentMinValue < transactionValue ? currentMinValue : transactionValue;

    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = MAX_TRANSACTION_VALUE;
        currentMaxValue = MIN_TRANSACTION_VALUE;
    }

    public static long getAverageOfTransaction() {
        if (countOfTransactions == 0) {
            return 0;
        } else return sumOfTransactions / countOfTransactions;
    }

    public static long getCurrentMinValue() {
        return currentMinValue == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {

        return currentMaxValue == 0 ? 0 : currentMaxValue;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions == 0 ? 0 : sumOfTransactions;
    }

    public long getTransactionValue() {
        return transactionValue;
    }
}
