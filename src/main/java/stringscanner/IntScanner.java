package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {

        Scanner sc = new Scanner("5;3;107;12;123;18;198");
        sc.useDelimiter(";");
        StringBuilder numbers = new StringBuilder();
        boolean donPutDot = true;

        while (sc.hasNext()) {
            int next = sc.nextInt();
            if (next > 100) {
                if (donPutDot) {
                    numbers.append(next);
                    donPutDot = !donPutDot;

                } else {
                    numbers.append(", ");
                    numbers.append(next);
                }
            }
        }

        return numbers.toString();
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts("5;3;107;12;123;18;198"));
    }
}
