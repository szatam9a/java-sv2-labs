package statements;

public class InvestmentMain {
    public static void main(String[] args) {
        Investment money = new Investment(100000, 8);
        System.out.println(money.getYield(50));
        System.out.println(money.closeT(80));
        System.out.println(money.close(80));
        money.close(80);
        System.out.println(money.close(80));
        System.out.println(money.closeT(80));

    }
}
