package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public void numbers(int number){

        while (isThereAnySevenAndStop(number)) {
            if (number%7==0){
                System.out.println("X");
            }else
            System.out.println(number);
            number++;
        }
    }
    private boolean isThereAnySevenAndStop(int number){
        if ((Integer.toString(number).contains("7")) && (number%7 !=0)) {
            return false;

        }
        return true;

    }

    public static void main(String[] args) {
        ForbiddenSevens forbiddenSevens = new ForbiddenSevens();
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a number");
        int number = scanner.nextInt();
        forbiddenSevens.numbers(number);

    }
}
