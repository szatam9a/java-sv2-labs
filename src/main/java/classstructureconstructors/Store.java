package classstructureconstructors;

public class Store {
    private String product;
    private int stock;
    public Store(String product){
        this.product = product;
        this.stock= 0 ;
    }


    public int getStock() {
        return stock;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void store(int volumen) {
        stock += volumen;}
    public void dispatch(int volumen) {
        stock = stock - volumen;
    }
}
