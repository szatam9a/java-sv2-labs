package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> list) {
        Pendrive best = null;
        for (Pendrive actual : list
        ) {
            if (best == null || actual.comparePricePerCapacity(best) == -1) {
                best = actual;
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> list) {
        Pendrive cheapest = null;
        for (Pendrive actual : list
        ) {
            if (cheapest == null || actual.isCheaperThan(cheapest)) {
                cheapest = actual;
            }
        }
        return cheapest;
    }
    public  void risePriceWhereCapacity(List<Pendrive> list, int percent, int capacity){
        for (Pendrive actual:list
             ) {
            if (actual.getCapacity()==capacity){
                actual.risePrice(percent);
            }
        }
    }
}
