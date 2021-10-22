package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Felhasználok listázása");
        System.out.println("2. Felhasználok felvétele");
        System.out.println("Többi: kilépés");
        int i = sc.nextInt();
        sc.nextLine();
        if (i ==1) System.out.println("Felhasználók listázása");
        if (i ==2) System.out.println("Felhasználó felvétele");

    }
}
