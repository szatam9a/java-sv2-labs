package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {
    private int passenger;
    final private int maxPassenger;

    public CanCarryPassengersBehaviour( int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    /**
     * load and return with the remaining value
     */
    @Override
    public int loadPassenger(int passengers) {


        if (passengers + passenger > maxPassenger) {
            passengers = (passenger +passengers - maxPassenger);
            passenger = maxPassenger;
            return passengers;
        } else {
            passenger += passengers;
            return 0;
        }
    }

    @Override
    public int getPassengers() {
        return passenger;
    }
}
