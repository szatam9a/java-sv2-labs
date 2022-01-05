package collectionsequalshash;

import java.util.Objects;

public class Product {
    private String name;
    private String registryNumber;

    public Product(String name, String registryNumber) {
        this.name = name;
        this.registryNumber = registryNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(registryNumber, product.registryNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registryNumber);
    }
}
