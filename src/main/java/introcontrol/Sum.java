package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=1;i<=5;i++){
            System.out.println("adj meg egy számot");
            sum = sum + sc.nextInt();
            sc.nextLine();

        }
        System.out.println(sum);
    }
}
