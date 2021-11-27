package algorithmssum.transaction;

public class Transaction {
    private String accountNumber;
    private double amount;
    private TransactionOperation transactionOperation;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }
    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT;
    }
    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public Transaction(String accountNumber, TransactionOperation transactionOperation, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionOperation = transactionOperation;
    }
}
