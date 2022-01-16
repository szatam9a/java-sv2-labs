package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDealer {
    private List<Car> cars;

    public CarDealer(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> comparedByPrice() {
        List<Car> result = new ArrayList<>(cars);
        Collections.sort(result, new CarPriceComparator());
        return result;
    }

    public List<Car> comparedByConstruction() {
        List<Car> result = new ArrayList<>(cars);
        Collections.sort(result, new CarConstructionComparator());
        return result;
    }
}
