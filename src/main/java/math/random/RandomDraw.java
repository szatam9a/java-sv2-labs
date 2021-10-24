package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> people = Arrays.asList("Pety","Pitya","Putya","Mutya","Kutya", "Bety","Ritya","Vutya","Cutya","Nutya");
        int firstFive;
        int others;
        Random rng = new Random();
        firstFive = rng.nextInt(0,5);
        others = rng.nextInt(5,10);
        System.out.println(people.get(firstFive));
        System.out.println(people.get(others));


    }
}
