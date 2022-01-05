package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public int findHowMany(Product product) {
        int counter = 0;
        for (Product p : products) {
            if (p.equals(product)) counter++;
        }
        return counter;
    }
    public void add(Product product){
        products.add(product);
    }

    public static void main(String[] args) {
        WebShop ws = new WebShop();
        ws.add(new Product("Name", "123"));
        ws.add(new Product("no name", "123"));
        System.out.println(ws.findHowMany(new Product("something","123")));
    }
}
