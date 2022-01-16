package collectionscomp.building;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String name;
    private double area;
    private Integer floors;

    @Override
    public int compareTo(Building o) {
        return floors.compareTo(o.floors);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;
        Building building = (Building) o;
        return floors.equals(building.floors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors);
    }

    @Override
    public String toString() {
        return "Building{" +
                "floors=" + floors +
                '}';
    }

    public Building(Integer floors) {
        this.floors = floors;
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building(12));
        buildings.add(new Building(15));
        buildings.add(new Building(9));
        buildings.add(new Building(7));
        System.out.println(buildings);
    }
}
