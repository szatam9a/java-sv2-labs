package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    Sales sales;

    @Test
    void selectSalesPersonWithMaxSalesAmountTest() {
        sales = new Sales();
        Salesperson theMax;
        List<Salesperson> toTest = Arrays.asList(
                new Salesperson("a", 1, 1),
                theMax = new Salesperson("a", 10, 1),
                new Salesperson("a", 1, 1),
                new Salesperson("a", 1, 1)
        );
        assertSame(theMax, sales.selectSalesPersonWithMaxSalesAmount(toTest));
    }

    @Test
    void selectSalesPersonWithFurthestAboveTargetTest() {
        sales = new Sales();
        Salesperson theFurthest;
        List<Salesperson> toTest = Arrays.asList(
                new Salesperson("a", 1, 1),
                new Salesperson("a", 10, 10),
                theFurthest = new Salesperson("a", 10, 1),
                new Salesperson("a", 1, 1)
        );
        assertSame(theFurthest,sales.selectSalesPersonWithFurthestAboveTarget(toTest));
    }

    @Test
    void selectSalesPersonWithFurthestBelowTargetTest() {
        sales = new Sales();
        Salesperson theFurthest;
        List<Salesperson> toTest = Arrays.asList(
                new Salesperson("a", 1, 1),
                new Salesperson("a", 10, 10),
                theFurthest = new Salesperson("a", 10, 100),
                new Salesperson("a", 1, 1)
        );
        assertSame(theFurthest,sales.selectSalesPersonWithFurthestBelowTarget(toTest));
    }
}