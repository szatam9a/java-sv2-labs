package controliteration.exit;

import java.util.Scanner;

public class Exit {
    private final static String MESSAGE = "Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával";
    private final static char QUITKEY = 'x';


    public void print() {
        System.out.println(MESSAGE);

    }

    public void control() {
        char tempChar=0 ;
        do {
            print();
            Scanner sc = new Scanner(System.in);
            String temp = sc.nextLine();
            tempChar = temp.charAt(0);
        }
        while (QUITKEY != tempChar);
    }

    public static void main(String[] args) {
        Exit exit = new Exit();
        exit.control();
    }
}
