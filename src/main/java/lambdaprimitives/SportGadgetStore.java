package lambdaprimitives;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SportGadgetStore {
    private List<Product> products;

    private DoubleSummaryStatistics getStats() {
        return products.stream().mapToDouble(e -> e.getPrice()).summaryStatistics();
    }

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        IntSummaryStatistics stat = products.stream().mapToInt(e -> e.getPieces()).summaryStatistics();
        return (int) stat.getSum();
    }

    public double getAveragePrice() {
        return getStats().getAverage();
    }

    public String getExpensiveProductStatistics(double minPrice) {
        DoubleSummaryStatistics stats = products.stream().filter(e -> e.getPrice() > minPrice).mapToDouble(e -> e.getPieces()).summaryStatistics();
        if (stats.getCount() == 0) {
            return "Nincs ilyen termék.";
        }
        return "Összesen " + stats.getCount() + " féle termék, amelyekből minimum " + (int) stats.getMin() + " db, maximum " + (int) stats.getMax() + " db, összesen " + (int) stats.getSum() + " db van.";
    }
}
