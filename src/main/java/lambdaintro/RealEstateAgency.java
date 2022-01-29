package lambdaintro;

import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {
    private List<Flat> flats;

    public RealEstateAgency(List<Flat> flats) {
        this.flats = flats;
    }

    private Flat findFirst(Predicate<Flat> condition) {
        return flats.stream().filter(condition).findFirst().orElseThrow(() -> new IllegalArgumentException("No such flat."));
    }

    public Flat findFirstCheaperFlat(int maxPrice) {
        return findFirst(i -> i.getPrice() < maxPrice);
    }

    public Flat findFirstGreaterFlat(double minArea) {
        return findFirst(i -> i.getArea() > minArea);
    }

    public Flat findFirstFlatInSameTown(String town) {
        return findFirst(i -> i.getAddress().contains(town));
    }
}
