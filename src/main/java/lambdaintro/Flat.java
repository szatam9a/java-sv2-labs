package lambdaintro;

public class Flat {
    private String address;
    private double area; // sqr m
    private int price; // in huf

    public Flat(String address, double area, int price) {
        this.address = address;
        this.area = area;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
