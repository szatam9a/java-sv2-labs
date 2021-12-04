package dynamictypes.publictransport;

public class Tram extends PublicVehicle{
    private int numberOfTramcars;

    public int getNumberOfTramcars() {
        return numberOfTramcars;
    }

    public void setNumberOfTramcars(int numberOfTramcars) {
        this.numberOfTramcars = numberOfTramcars;
    }

    public Tram(int lineNumber, double length, int numberOfTramcars) {
        super(lineNumber, length);
        this.numberOfTramcars = numberOfTramcars;
    }
}
