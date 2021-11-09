package stringscanner;

import java.util.Scanner;


public class StringScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("több tagmondatból álló mondat!");
        String stringToWorkWith = scan.nextLine();

        Scanner stringByWords = new Scanner(stringToWorkWith);
        while (stringByWords.hasNext()) {
            System.out.println(stringByWords.next());
        }

        System.out.println("több tagmondatból álló mondat!");
        String scannedToSplit = scan.nextLine();

        Scanner scannerToSplit = new Scanner(scannedToSplit);
        scannerToSplit.useDelimiter(", ");

        while (scannerToSplit.hasNext()) {
            System.out.println(scannerToSplit.next());
        }
    }
}
