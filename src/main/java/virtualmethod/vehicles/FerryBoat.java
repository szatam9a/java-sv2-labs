package virtualmethod.vehicles;

public class FerryBoat extends Vehicle {
    public static final double MAX_CARRY_WEIGHT = 1000;
    Car car;

    public FerryBoat(double vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public double getGrossLoad() {
        return super.getGrossLoad() + carsWeight();
    }

    private double carsWeight() {
        if (car == null) {
            return 0;
        } else
            return car.getGrossLoad();
    }

    public boolean canCarry(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("there is no car");
        } else {
            if (car.getGrossLoad() < MAX_CARRY_WEIGHT) {
                return true;
            }
        }
        return false;
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }
}
