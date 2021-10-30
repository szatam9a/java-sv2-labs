package attributes.bill;

public class BillItem {
    private String product;
    private int price;
    private int quantity;
    private double vatPercent;

    public BillItem() {
    }
    public double calculateTotalPrice(){
        return (price*quantity*vatPercent/100);
    }
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(double vatPercent) {
        this.vatPercent = vatPercent;
    }

    public static void main(String[] args) {
        BillItem billItem = new BillItem();
        billItem.setPrice(100);
        billItem.setProduct("Kacsa");
        billItem.setQuantity(5);
        billItem.setVatPercent(20);
        System.out.println(billItem.calculateTotalPrice());
    }
}
