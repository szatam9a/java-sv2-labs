package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    private int numbersToWrite;

    public void readIn() {
        System.out.println("Numbers of fibb numbers?!");
        Scanner sc = new Scanner(System.in);
        setNumbersToWrite(sc.nextInt());
        sc.nextLine();
    }

    public void fibNumbersWhile() {
        int lastNumber = 0;
        int temp = 0;
        int next = 1;
        int i=0;

        while (i < numbersToWrite) {

            System.out.println(lastNumber);
            temp = next;
            next += lastNumber;
            lastNumber = temp;
            i++;
        }
    }

    public void fibNumbersFor() {

        int lastNumber = 0;
        int temp = 0;
        int next = 1;

        for (int i = 0; i < numbersToWrite; i++) {
            System.out.println(lastNumber);
            temp = next;
            next += lastNumber;
            lastNumber = temp;
        }
    }

    public int getNumbersToWrite() {
        return numbersToWrite;
    }

    public void setNumbersToWrite(int numbersToWrite) {
        this.numbersToWrite = numbersToWrite;
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.readIn();
        fib.fibNumbersFor();
        //fib.fibNumbersWhile();
    }
}
