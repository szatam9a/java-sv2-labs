package conversions;

public class TooBigNumber {
    public final long LIMIT = 2_147_483_647;

    public long getRightResult(int number) {
        long temp = number + LIMIT;
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        TooBigNumber toBig = new TooBigNumber();
        toBig.getRightResult(13);
    }
}
