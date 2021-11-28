package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccount {
    private String nameOfOwner;
    private String accountNUmber;
    private int balance;


    public void withdraw (int amount){
        balance-=amount;
    }
    public void deposit (int amount){
        balance+=amount;
    }

    public BankAccount(String nameOfOwner, String accountNUmber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNUmber = accountNUmber;
        this.balance = balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNUmber() {
        return accountNUmber;
    }

    public int getBalance() {
        return balance;
    }
}

