package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {
    private List<CoffeeOrder> orders;


    public Integer getTotalIncome() {
        return orders
                .stream()
                .flatMap(l -> l.getCoffees()
                        .stream())
                .mapToInt(e -> e.getPrice())
                .sum();
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders
                .stream()
                .filter(e -> e.getDateTime()
                        .toLocalDate()
                        .equals(date))
                .flatMap(y -> y.getCoffees()
                        .stream())
                .mapToInt(e -> e.getPrice())
                .sum();
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders
                .stream()
                .flatMap(e -> e.getCoffees()
                        .stream())
                .filter(e -> e.getType()
                        .equals(type))
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return orders.stream().filter(e -> e.getDateTime().isAfter(from)).collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders.stream()
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .collect(Collectors.toList());
    }

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
