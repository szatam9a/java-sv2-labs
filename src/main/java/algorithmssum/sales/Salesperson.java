package algorithmssum.sales;

public class Salesperson {
    private String name;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public Salesperson(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }
}
