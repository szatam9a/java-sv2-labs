package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void sumTheProfit() {
        SalesAmountSumCalculator salesCalculator = new SalesAmountSumCalculator();
        List<Salesperson> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Salesperson("joe",1));
        listOfPersons.add(new Salesperson("joe",2));

        assertEquals(3,salesCalculator.sumTheProfit(listOfPersons));
    }
}