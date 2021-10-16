package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwner() {
        return owner;
    }
//alt insert konstruktor kreálás.
    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money){
        balance -= money;
    }
    public String getInfo(){
        return owner + " ("+ accountNumber+") :"+balance + "Ft";
    }
}
