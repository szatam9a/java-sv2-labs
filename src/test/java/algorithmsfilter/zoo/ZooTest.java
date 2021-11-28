package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void getAnimalsWithNumberOfLegsGivenTest() {
        Zoo zoo = new Zoo(Arrays.asList(
                new Animal("a", 2),
                new Animal("a", 2),
                new Animal("a", 3),
                new Animal("a", 3),
                new Animal("a", 4),
                new Animal("a", 4),
                new Animal("a", 6),
                new Animal("a", 6)
        ));

        assertEquals(2, zoo.getAnimalsWithNumberOfLegsGiven(3).size());
        assertEquals(2, zoo.getAnimalsWithNumberOfLegsGiven(4).size());
    }
}