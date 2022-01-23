package lambdaintermediate;

import java.time.LocalDateTime;
import java.util.List;

public class CoffeeOrder {
    private List<Coffee> coffeeList ;
    private LocalDateTime dateTime;

    public CoffeeOrder(List<Coffee> coffeeList, LocalDateTime dateTime) {
        this.coffeeList = coffeeList;
        this.dateTime = dateTime;
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" +
                "coffeeList=" + coffeeList +
                ", dateTime=" + dateTime +
                '}';
    }
}
