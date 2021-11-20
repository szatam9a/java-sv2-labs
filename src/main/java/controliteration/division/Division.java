package controliteration.division;

import java.util.Scanner;

public class Division {


    public void numberInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int theNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divider = sc.nextInt();
        sc.nextLine();
        divideWithWhile(theNumber,divider);
        System.out.println();
        divideWithFor(theNumber,divider);

    }
    public void divideWithFor(int theNumber, int divider){
        for (int i = 1; i < theNumber ; i++) {
            if (i%divider==0){
                System.out.print(i +", ");
            }
        }
    }
    public void divideWithWhile(int theNumber, int divider){
        int i = 1;
        while (i<theNumber){
            if (i%divider==0){
                System.out.print(i +", ");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Division div=new Division();
        div.numberInput();
    }
}
