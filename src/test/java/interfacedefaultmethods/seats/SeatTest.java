package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void getNumberOfSeatsTest() {

        Seat seat = new Car("ok",1);
        assertEquals(1,seat.getNumberOfSeats());

        seat = new FamilyCar();
        assertEquals(5,seat.getNumberOfSeats());

        seat= new SportsCar();
        assertEquals(2,seat.getNumberOfSeats());

    }
}