package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Kutya");
        fruits.add("Cica");
        fruits.add("Mérési");
        fruits.add("Hiba");
        fruits.add("Ikea");
        System.out.println(fruits.size());
        System.out.println(fruits.toString());
        fruits.remove(3);
        fruits.remove(3);
        System.out.println(fruits.size());
        System.out.println(fruits.toString());


    }
}
