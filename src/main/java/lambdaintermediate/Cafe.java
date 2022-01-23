package lambdaintermediate;

import java.time.LocalDate;
import java.util.List;

public class Cafe {
    private List<CoffeeOrder> orders;


    public Integer getTotalIncome() {
        return orders
                .stream()
                .flatMap(l -> l.getCoffeeList()
                        .stream())
                .mapToInt(e -> e.getPrice())
                .sum();
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders
                .stream().peek(System.out::println)
                .filter(e -> e.getDateTime()
                        .equals(date)).peek(e-> System.out.println(e.getDateTime()))
                .flatMap(y -> y.getCoffeeList()
                        .stream())
                .mapToInt(e -> e.getPrice())
                .sum();
    }
//
//    public long getNumberOfCoffee(CoffeeType type) {
//    }
//
//    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
//    }
//
//    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
//    }

    public List<CoffeeOrder> getOrders() {
        return orders;
    }

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void addOrder(CoffeeOrder coffeeOrder) {
        orders.add(coffeeOrder);
    }
}
