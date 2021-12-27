package exceptions.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    NumbersSum sum;

    @Test
    void getSumTest() {
        sum = new NumbersSum();
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        assertEquals(55, sum.getSum(numbers));
    }

    @Test
    void testGetSumTest() {
        sum = new NumbersSum();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(55, sum.getSum(numbers));
    }

    @Test
    void getParseErrorTest() {
        sum = new NumbersSum();
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "öt" };
        NumberFormatException nfe = assertThrows(NumberFormatException.class,
                () -> sum.getSum(numbers));
        assertEquals("cant parseInt an element in the string array", nfe.getMessage());
    }

    @Test
    void isTheObjectNullTest() {
        sum = new NumbersSum();
        int[] numbers = null;
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> sum.isTheObjectNull(numbers));
        assertEquals("the parameter is null", iae.getMessage());

    }
}