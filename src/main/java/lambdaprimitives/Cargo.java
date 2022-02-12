package lambdaprimitives;

public class Cargo {
    private String description;
    private int weight;
    private double length;

    public String getDescription() {
        return description;
    }

    public int getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public Cargo(String description, int weight, double length) {
        this.description = description;
        this.weight = weight;
        this.length = length;
    }
}
