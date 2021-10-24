package looptypes;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public void printSums(int[] numbers){
        for (int i = 1; i < numbers.length ; i++) {
            System.out.print(numbers[i]+numbers[i-1]+" ");
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int [] numeros = {2, 6, 3, 5, 7,9 };
        sum.printSums(numeros);
    }
}
