package interfacestaticmethods.vehicle;

public interface Vehicle {
    static Vehicle of(int numberOfWheels) {
        if (numberOfWheels == 2) {
            return new Bicycle(numberOfWheels);
        } else if (4 == numberOfWheels) {
            return new Car(numberOfWheels);
        } else throw new IllegalArgumentException("The number of wheels Does not fit to any vehicle");
    }
}
