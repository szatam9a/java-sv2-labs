package sorting.webshop;

import java.time.LocalDateTime;

public class Product {
    private String name;
    private int price;
    private LocalDateTime time;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Product(String name, int price, LocalDateTime time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }
}
