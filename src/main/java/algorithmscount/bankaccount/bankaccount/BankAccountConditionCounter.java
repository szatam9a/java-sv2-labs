package algorithmscount.bankaccount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countBalanceOver(List<BankAccount> list, double minimumBalance){
        int sum =0;
        for (BankAccount b:list
             ) {
            if (b.getBalance()>minimumBalance){
                sum++;
            }
        }
    return sum;}
}
