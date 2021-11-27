package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void countChildrenWithHeightGreaterThanTest() {
        Height height = new Height();
        List<Integer> listOfHieghts = Arrays.asList( 1,2,3,4,5);
        int toTest = height.countChildrenWithHeightGreaterThan(listOfHieghts,3);
        assertEquals(2,toTest);
    }
}