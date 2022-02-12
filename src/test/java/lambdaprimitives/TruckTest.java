package lambdaprimitives;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TruckTest {

    @Test
    void getShortestLengthTest() {
        List<Cargo> c = new ArrayList<>();
        Truck t = new Truck(c);
        assertThrows(IllegalArgumentException.class, ()-> t.getAverageWeight());
        assertEquals(0,t.getShortestLength());
        System.out.println(t.getWeightStatistics());
        c.add(new Cargo("a",1,1));
        assertEquals(1,t.getShortestLength());
        assertEquals(1,t.getTotalWeight());
        assertEquals(1,t.getAverageWeight());
        System.out.println(t.getWeightStatistics());
    }
}