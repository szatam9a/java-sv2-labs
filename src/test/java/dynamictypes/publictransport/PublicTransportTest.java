package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    PublicTransport pt;


    @Test
    void addVechilesTest() {
        pt = new PublicTransport();
        pt.addVechiles(new Bus(10, 10, "IKARUS"));
        assertEquals(1, pt.getPublicVehicles().size());
    }

    @Test
    void getPublicVehiclesTest() {
        pt = new PublicTransport();

        PublicVehicle bus= new Bus(1,1,"Ik");
        PublicVehicle metro= new Metro(1,1,1);
        PublicVehicle tram = new Tram (1,1,1);


        pt.addVechiles(new Bus(1, 1, "IAKRUS"));
        pt.addVechiles(new Metro(1, 1, 6));
        pt.addVechiles(new Tram(1, 1, 6));

        assertEquals(3, pt.getPublicVehicles().size());
    }

}