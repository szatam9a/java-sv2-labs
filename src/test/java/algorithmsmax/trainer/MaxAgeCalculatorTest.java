package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void getTrainerWithMaxAgeTest() {
        MaxAgeCalculator mac = new MaxAgeCalculator();
        Trainer oldest;
        List<Trainer> toTest = Arrays.asList(
                new Trainer("a",1),
                oldest = new Trainer("a",50),
                new Trainer("a",3)
        );
        assertSame(oldest, mac.getTrainerWithMaxAge(toTest));
    }
}