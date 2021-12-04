package inheritancemethods.plane;

public class Passenger {
    private String name;
    private int priceOfPlaneTicket;

    public Passenger(String name, int priceOfPlaneTicket) {
        this.name = name;
        this.priceOfPlaneTicket = priceOfPlaneTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceOfPlaneTicket() {
        return priceOfPlaneTicket;
    }

    public void setPriceOfPlaneTicket(int priceOfPlaneTicket) {
        this.priceOfPlaneTicket = priceOfPlaneTicket;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" +getName() + '\'' +
                ", priceOfPlaneTicket=" + getPriceOfPlaneTicket() +
                '}';
    }
}
