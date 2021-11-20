package introexceptiontrycatchtrace;

import java.util.Scanner;

public class Calculator {
    private int numberA;
    private int numberB;

    public void readInNumberA(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a number");
        numberA = scanner.nextInt();
        scanner.nextLine();
    }  public void readInNumberB(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a number");
        numberB = scanner.nextInt();
        scanner.nextLine();
    }
    public String readInOperator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what opeartion you want?");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: *");
        System.out.println("4: /");
        String operation = scanner.nextLine();
        return operation;
    }

    public int add() {
        return numberA + numberB;
    }

    public int subtract() {
        return numberA - numberB;
    }

    public int multiply() {
        return numberA * numberB;
    }

    public int divide() {
        return numberA / numberB;
    }

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }
}
