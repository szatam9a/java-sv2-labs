package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        checkNullObject(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }

    public void deposit(double value) {
        if (value<=0){
            throw new InvalidAmountBankOperationException("cant deposit negative or 0");
        }
        balance += value;
    }

    public void subtract(double value) {
        if (value<0 || value>maxSubtract)
        {
            throw new InvalidAmountBankOperationException("the amount must be in between 0 and "+ maxSubtract);
        }
        balance -= value;
    }
    private void checkNullObject(String accountNumber){
        if (accountNumber==null){
            throw new IllegalArgumentException("account number is null");
        }
    }
}
