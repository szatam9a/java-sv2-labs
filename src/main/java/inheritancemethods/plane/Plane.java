package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("name", 1000);
        PriorityPassenger pPassenger = new PriorityPassenger("pname", 1000, 10);
        FirstClassPassenger fcPassenger = new FirstClassPassenger("fcname", 1000, 10);
        System.out.println(passenger);
        System.out.println(pPassenger);
        System.out.println(fcPassenger);
    }
}
