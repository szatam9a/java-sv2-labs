package algorithmsmax.sales;

import algorithmsmax.trainer.Trainer;

import java.util.List;

public class Sales {
    public  Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales){
        Salesperson maxSales = null;

        for (Salesperson actual : sales
        ) {
            if (maxSales == null || actual.getAmount() > maxSales.getAmount()) {
                maxSales = actual;
            }
        }
        return maxSales;
    }
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        Salesperson selectedOneSalesperson = null;
        double differnt = 0;

        for (Salesperson actual:sales
             ) {
             if (selectedOneSalesperson == null|| (actual.getAmount()-actual.getTarget())>differnt){
                 differnt = actual.getAmount()-actual.getTarget();
                 selectedOneSalesperson = actual;
             }
        }
    return selectedOneSalesperson;}
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
        Salesperson selectedOneSalesperson = null;
        double differnt = 0;

        for (Salesperson actual:sales
        ) {
            if (selectedOneSalesperson == null|| (actual.getAmount()-actual.getTarget())<differnt){
                differnt = actual.getAmount()-actual.getTarget();
                selectedOneSalesperson = actual;
            }
        }
    return selectedOneSalesperson;}




}
