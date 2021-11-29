package recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void getSumTest() {
        Numbers numbers = new Numbers();
        int[] toTest ={1,2,3,4,5};

        assertEquals(15, numbers.getSum(toTest));
    }
}