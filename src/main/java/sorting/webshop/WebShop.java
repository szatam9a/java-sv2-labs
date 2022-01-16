package sorting.webshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();



    public void addProducts(Product product) {
        products.add(product);
    }

    public List<Product> getProductsOrderByPrice() {
        List<Product> result = new ArrayList<>(products);
        result.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
            }
        });
        return result;
    }

    public List<Product> getProductsOrderByName() {
        List<Product> result = new ArrayList<>(products);
        Collections.sort(result, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return result;
    }

    public List<Product> getProductsOrderByDate() {
        List<Product> result = new ArrayList<>(products);
        result.sort(Comparator.comparing(Product::getTime));
        Collections.sort(result, Comparator.comparing(Product::getTime));
        return result;
    }
}
