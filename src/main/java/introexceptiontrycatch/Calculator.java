package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA;
        int numberB;

        try {
            System.out.println("give a number");
            numberA = scanner.nextInt();
            scanner.nextLine();

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("nem számot addott meg, akkor 0 ");
            numberA = 0;
        }

        try {
            System.out.println("give a number");
            numberB = scanner.nextInt();
            scanner.nextLine();

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("nem számot addot meg, akkor 1 ");
            numberB = 1;
        }



        System.out.println("what opeartion you want?");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        String operation = scanner.nextLine();

        switch (operation) {
            case "1":
                System.out.println(numberA + numberB);
                break;
            case "2":
                System.out.println(numberA - numberB);
                break;
            case "3":
                System.out.println(numberA * numberB);
                break;
            case "4":
                try {
                    System.out.println(numberA / numberB);
                } catch (ArithmeticException zero) {
                    System.out.println("nullával nem osztunk");
                }
                break;
        }

    }
}
