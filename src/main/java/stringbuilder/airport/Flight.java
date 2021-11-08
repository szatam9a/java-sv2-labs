package stringbuilder.airport;

public class Flight {
    private String flightNumber;
    private Status status;

    public String getFlightNumber() {
        return flightNumber;
    }

    public Flight(String flightNumber, Status status) {
        this.flightNumber = flightNumber;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
