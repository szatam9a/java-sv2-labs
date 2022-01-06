package collectionslist;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    @Test
    void addFlowerInTheMiddleTest() {
        BunchOfFlowers bof = new BunchOfFlowers();
        bof.addFlowerInTheMiddle("Rózsa");
        bof.addFlowerInTheMiddle("Ibolya");
        bof.addFlowerInTheMiddle("Tulipan");
        assertEquals("Ibolya", bof.getTheFlowers().get(0));
    }
    @Test
    void addFlowerInTheMiddleTwoTest() {
        BunchOfFlowers bof = new BunchOfFlowers(new LinkedList<>(List.of("Hatyu","Hatyu")));
        bof.addFlowerInTheMiddle("Rózsa");
        bof.addFlowerInTheMiddle("Ibolya");
        bof.addFlowerInTheMiddle("Tulipan");
        assertEquals("Rózsa",bof.getTheFlowers().get(bof.getTheFlowers().size()/2));
    }
}