package methodparam.sums;

public class Sumed {
    private double negative;
    private double positive;

    public double getNegative() {
        return negative;
    }

    public double getPositive() {
        return positive;
    }

    public void addANumber(double number) {
        if (number >= 0) {
            positive += number;
        } else negative += number;
    }

    public void setNegative(double negative) {
        this.negative = negative;
    }

    public void setPositive(double positive) {
        this.positive = positive;
    }
}
