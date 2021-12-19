package interfacerules.sharedattributes;

public class ParkingPlace implements Length,Width{
    public ParkingPlace() {
    }

    @Override
    public double getLength() {
        return 5;
    }

    @Override
    public double getWidth() {
        return 2.2;
    }
}
