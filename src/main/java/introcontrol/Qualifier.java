package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("szám");
        int i= scanner.nextInt();
        scanner.nextLine();
        System.out.println(i>100?"Nagyobb, mint száz":"Száz, vagy kisebb mint száz");
        if (i>100) System.out.println("Nagyobb, mint száz"); else System.out.println("Száz, vagy kisebb mint száz");
    }
}
