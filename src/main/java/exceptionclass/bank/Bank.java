package exceptionclass.bank;

import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank(List<Account> accountList) {
        checkNullObject(accountList);
        this.accountList = accountList;
    }

    public void decrease(String accountNumber, double value) {
        Account target = getTheAccountByNumber(accountNumber);
        if (target.getBalance() < value) {
            throw new LowBalanceBankOperationException("not enough money");
        } else target.subtract(value);
    }

    public void increase(String accountNumber, double value) {
        getTheAccountByNumber(accountNumber).deposit(value);
    }

    private void checkNullObject(List<Account> list) {
        if (list == null) throw new IllegalArgumentException("null list");
    }

    private Account getTheAccountByNumber(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException("the account is not in the list" + accountNumber);
    }
}
