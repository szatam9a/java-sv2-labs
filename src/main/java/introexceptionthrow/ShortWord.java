package introexceptionthrow;

import java.util.Locale;
import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("TÚL HOSSSZÚ SZÓ");
        }


        char[] chars = word.toCharArray();
        for (char actualChar : chars) {
            if (!Character.isLetter(actualChar)) {
                throw new IllegalArgumentException("Nem csak betűt tartalmaz: ".toUpperCase(Locale.ROOT) + word);
            }
        }

        System.out.println(word);
    }
}
