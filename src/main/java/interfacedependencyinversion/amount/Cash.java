package interfacedependencyinversion.amount;

public class Cash implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        char lastDigit = Integer.toString(amount).charAt(Integer.toString(amount).length() - 1);
        int theDigit = Integer.parseInt(String.valueOf(lastDigit));
        switch (theDigit) {
            case 1:
            case 2:
                amount -= theDigit;
                break;
            case 3:
            case 4:
                amount += (5 - theDigit);
                break;
            case 6:
            case 7:
                amount -= (theDigit-5);
                break;
            case 8:
            case 9:
                amount += (10 - theDigit);
                break;
        }
        return amount;
    }
}
