package virtualmethod.vehicles;

public class Van extends Car {
    private double cargoWeight;

    public Van(double vehicleWeight, int numberOfPassenger, double cargoWeight) {
        super(vehicleWeight, numberOfPassenger);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double getGrossLoad() {
        return super.getGrossLoad() + cargoWeight;
    }

    @Override
    public String toString() {
        return "Van{" +
                "cargoWeight=" + cargoWeight +
                ", numberOfPassenger=" + getNumberOfPassenger() + ", vehicleWeight" + getVehicleWeight()+
                '}';
    }
}
