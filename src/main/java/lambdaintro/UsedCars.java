package lambdaintro;

import java.util.Comparator;
import java.util.List;

public class UsedCars {
    private List<Car> carList;

    public UsedCars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> listCarsByPrice() {
        return carList.stream().sorted(Comparator.comparing(Car::getPrice)).toList();
    }

    public List<Car> listCarsByLengthDesc() {
        return carList.stream().sorted(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Double.valueOf(o2.getLength()).compareTo(o1.getLength());
            }
        }).toList();
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        return carList.stream().filter(e -> e.getBrand().equals(brand)).sorted(Comparator.comparing(Car::getType)).toList();
    }
}
