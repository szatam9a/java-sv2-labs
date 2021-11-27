package algorithmscount.transaction;

public class Transaction {
    private String accountNumber;
    private TransactionType transactionType;
    private double amount;

    public Transaction(String accountNumber, TransactionType transactionType, double amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean isCredit(){
        if (transactionType== TransactionType.CREDIT){
            return true;
        } return false;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }
}
