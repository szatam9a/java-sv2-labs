package arraylist;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92);
        boolean counter = false;

        for (int list : numeros) {
            if (counter) {
                System.out.print(list + ", ");
            }
            counter = !counter;
        }
    }
}

