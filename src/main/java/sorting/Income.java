package sorting;

import java.util.*;

public class Income {
    private int[] incomeInTheWholeYear;

    public Income(int[] incomeInTheWholeYear) {
        this.incomeInTheWholeYear = incomeInTheWholeYear;
    }

    public int getHighestIncome() {
        Arrays.sort(incomeInTheWholeYear);
        return incomeInTheWholeYear[incomeInTheWholeYear.length - 1];
    }

    public int[] getIncomeInTheWholeYear() {
        return incomeInTheWholeYear;
    }
}
