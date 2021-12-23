package virtualmethod.vehicles;

public class Vehicle {
    public static final int PERSON_AVERAGE_WEIGHT = 75;
    private double vehicleWeight;

    public Vehicle(double vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public double getGrossLoad() {
        return vehicleWeight + PERSON_AVERAGE_WEIGHT;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleWeight=" + vehicleWeight +
                '}';
    }

    public double getVehicleWeight() {
        return vehicleWeight;
    }
}
