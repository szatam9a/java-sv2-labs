package lambdaintermediate;

public class Coffee {
    private CoffeeType type;
    private int price;

    public Coffee() {
    }

    public CoffeeType getType() {
        return type;
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Coffee(CoffeeType type, int price) {
        this.type = type;
        this.price = price;
    }
}
