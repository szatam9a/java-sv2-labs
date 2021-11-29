package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private double capacity;
    private double price;

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public void risePrice(int percent) {
        price = price * (1 + percent);
    }

    public int comparePricePerCapacity(Pendrive other) {
        if (this.pricePerCap() > other.pricePerCap()) {
            return 1;
        } else if (this.pricePerCap() == other.pricePerCap()) {
            return 0;
        } else return -1;
    }

    public boolean isCheaperThan(Pendrive other) {
        if (this.price < other.getPrice()) {
            return true;
        } else return false;
    }

    private double pricePerCap() {
        return price / capacity;
    }

    @Override
    public String toString() {
        return name + capacity + price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
