package lambdaprimitives;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

public class Truck {
    private List<Cargo> thingsToLoad;

    public List<Cargo> getThingsToLoad() {
        return thingsToLoad;
    }

    public Truck(List<Cargo> thingsToLoad) {
        this.thingsToLoad = thingsToLoad;
    }

    public double getShortestLength() {
        if (thingsToLoad.size() == 0) return 0;
        return thingsToLoad.stream().mapToDouble(e -> e.getLength()).summaryStatistics().getMin();
    }

    public int getTotalWeight() {
        if (thingsToLoad.size() == 0) return 0;
        return (int) thingsToLoad.stream().mapToInt(e -> e.getWeight()).summaryStatistics().getSum();
    }

    public double getAverageWeight() {
        DoubleStream ds = (thingsToLoad.stream().mapToDouble(e -> e.getWeight()));
        return ds.average().orElseThrow(() -> new IllegalArgumentException("No cargo."));
    }

    public int getMaxWeight() {
        DoubleStream ds = (thingsToLoad.stream().mapToDouble(e -> e.getWeight()));
        return (int) ds.max().orElse(0);
    }

    public String getWeightStatistics() {
        if (thingsToLoad.size() == 0) {
            return "No cargo.";
        }
        DoubleSummaryStatistics ds = (thingsToLoad.stream().mapToDouble(e -> e.getWeight())).summaryStatistics();

        return "A rakományban található " + (int) ds.getCount() + " tétel, melyeknek összsúlya "
                + (int) ds.getSum() + " kg, közülük a legnehezebb " + (int) ds.getMax() + " kg, a legkönnyebb " +
                (int) ds.getMin() + " kg. A súlyuk átlagosan " + ds.getAverage() + " kg.";
    }
}
