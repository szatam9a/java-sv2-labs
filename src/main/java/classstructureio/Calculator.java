package classstructureio;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbera,numberb;
        numberb = 2;
        numbera = 1;
        System.out.println(numbera);
        System.out.println(numberb);

        System.out.println("whats the first number?");
        numbera = scanner.nextInt();
        scanner.nextLine();
        System.out.println("whats the second number?");
        numberb = scanner.nextInt();
        scanner.nextLine();

        System.out.println(numbera + "+" + numberb);
        System.out.println(numbera+numberb);

    }
}
