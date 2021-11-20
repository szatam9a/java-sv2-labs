package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
       Calculator calculator = new Calculator();


        try {
            calculator.readInNumberA();

        } catch (InputMismatchException inputMismatchException) {
            System.out.println("nem számot addott meg, akkor 0 ");
            calculator.setNumberA(0);
        }

        try {
            calculator.readInNumberB();


        } catch (InputMismatchException inputMismatchException) {
            System.out.println("nem számot addot meg, akkor 1 ");
            calculator.setNumberB(1);
        }





        switch (calculator.readInOperator()) {
            case "1":
                System.out.println(calculator.add());
                break;
            case "2":
                System.out.println(calculator.subtract());
                break;
            case "3":
                System.out.println(calculator.multiply());
                break;
            case "4":
                try {
                    System.out.println(calculator.divide());
                } catch (ArithmeticException zero) {
                    System.out.println("nullával nem osztunk");
                }
                break;
            default:
                System.out.println("nem jót válaszottál");
                break;
        }

    }
}
