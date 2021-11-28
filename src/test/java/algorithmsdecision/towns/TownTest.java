package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    @Test
    void containTest(){
        Town town = new Town();
        List<Integer> toTest = Arrays.asList(1,2,3,4,5);
        assertTrue(town.containsFewerHabitants(toTest,3));
        assertTrue(town.containsFewerHabitants(toTest,4));
        assertFalse(town.containsFewerHabitants(toTest,1));
    }
}