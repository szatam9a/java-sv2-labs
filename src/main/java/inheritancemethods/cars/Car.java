package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
    }

    public void drive(int km) {
        if (!isEnoughFuel(km)) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        fuel -= km * fuelRate / 100;
    }

    private boolean isEnoughFuel(int distance) {
        return (fuel - distance * fuelRate / 100) >= 0.0;
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }


    public double getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(double fuelRate) {
        this.fuelRate = fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
