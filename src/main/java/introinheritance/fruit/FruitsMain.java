package introinheritance.fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitsMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        Apple apple = new Apple();
        apple.setPieces(1);
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setColour(Colour.YELLOW);
        goldenDelicious.setPieces(1);
        Starking starking = new Starking();
        starking.setPieces(1);
        starking.setColour(Colour.RED);
        Grape grape = new Grape();
        grape.setType("deadly");
        fruits.add(apple);
        fruits.add(goldenDelicious);
        fruits.add(starking);
        fruits.add(grape);
        for (Fruit f: fruits
             ) {
            f.setWeight(1);
            f.setName("Fruit");
            System.out.println(f.toString());
        }
        }
    }

