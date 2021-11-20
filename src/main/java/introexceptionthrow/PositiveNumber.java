package introexceptionthrow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        System.out.println("kérek a pozitiv szám ");
        Scanner scanner = new Scanner(System.in);
        try {
            int positiveNumber= scanner.nextInt();
            if (positiveNumber<0) {
                throw new IllegalArgumentException("NEGATÍV SZÁM");
            }
        }
        catch (IllegalArgumentException iae){
            System.out.println("nem megfejelő SZÁM ez negatív");
        }
        catch (InputMismatchException ime){
            System.out.println("ez Szöveg");
        }

    }
}
