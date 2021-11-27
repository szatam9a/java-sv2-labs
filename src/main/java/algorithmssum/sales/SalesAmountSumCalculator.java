package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {
    public double sumTheProfit(List<Salesperson> listOfPersons){
        double sum = 0;
        for (Salesperson person: listOfPersons
             ) {
              sum += person.getAmount();
        }
    return sum;}
}
