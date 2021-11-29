package immutable;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfProduct;

    public Car(String brand, String type, int yearOfProduct) {
        if (brand==null || brand.isEmpty()){throw new IllegalArgumentException("Brand cant be empty") ;}
        this.brand = brand;
        this.type = type;
        if (yearOfProduct> LocalDate.now().getYear()){throw new IllegalArgumentException("The product was made in future");}
        this.yearOfProduct = yearOfProduct;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }
}
