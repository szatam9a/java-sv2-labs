package stringbuilder.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {

        StringBuilder result = new StringBuilder();
        result.append("Törölt járatok: \n");

        for (Flight actual : flights
        ) {
            if (actual.getStatus().equals(Status.DELETED)) {
                result.append(actual.getFlightNumber() + "\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.addFlight(new Flight("B-2351", Status.DELETED));
        airport.addFlight(new Flight("B-2352", Status.DELETED));
        airport.addFlight(new Flight("B-2353", Status.ACTIVE));
        System.out.println(airport.getDeletedFlights());
    }


}
