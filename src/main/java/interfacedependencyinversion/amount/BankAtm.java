package interfacedependencyinversion.amount;

public class BankAtm implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        return (int)(Math.round(amount/1000.0)*1000);
    }
}
