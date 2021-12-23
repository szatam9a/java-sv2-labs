package virtualmethod.vehicles;

public class Car extends Vehicle {
    private int numberOfPassenger; //exclude the driver

    public Car(double vehicleWeight, int numberOfPassenger) {
        super(vehicleWeight);
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public double getGrossLoad() {
        return super.getGrossLoad() + numberOfPassenger * PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfPassenger=" + numberOfPassenger +
                '}';
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }
}
