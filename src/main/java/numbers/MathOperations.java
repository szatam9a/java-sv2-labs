package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println("mi a megoláds");
        System.out.println("1+1*2*2+(1*0)");
        double number = 1+1*2*2+(1*0);
        Scanner scanner = new Scanner(System.in);
        double guess = scanner.nextDouble();
        System.out.println(number);
        if (Math.abs(guess-number)<0.0001){
            System.out.println("jó  megoldás");
        }


    }
}
