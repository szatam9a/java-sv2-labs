package recursion;

import java.util.Locale;

public class Vowels {
    public int getNumberOfVowels(String word) {
        int count;
        word = word.toLowerCase(Locale.ROOT);
        char ch = word.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count = 1;
        } else count = 0;
        if (word.length() > 1) {
            count += getNumberOfVowels(word.substring(1, word.length()));
        }
        return count;
    }
}
