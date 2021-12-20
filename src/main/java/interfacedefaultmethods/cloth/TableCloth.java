package interfacedefaultmethods.cloth;

public class TableCloth implements Square{
    public TableCloth(double side) {
        this.side = side;
    }

    private double side;

    @Override
    public double getSide() {
        return side;
    }
}
