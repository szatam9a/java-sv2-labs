package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void getHighestIncomeTest() {
        Income income = new Income(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals(6, income.getHighestIncome());
        System.out.println(income.getHighestIncome());
    }
}