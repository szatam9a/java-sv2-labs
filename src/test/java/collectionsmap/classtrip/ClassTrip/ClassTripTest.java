package collectionsmap.classtrip.ClassTrip;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    @Test
    void loadInPaymentsTest() {
        ClassTrip classTrip = new ClassTrip();
        classTrip.loadInPayments(Path.of("src/main/resources/classtrip/money.txt"));
        System.out.println(classTrip.getInPayments());
        assertEquals(15_000,classTrip.getInPayments().get("Szép Virág"));
    }
}