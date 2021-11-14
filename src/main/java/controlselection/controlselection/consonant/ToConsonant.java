package controlselection.controlselection.consonant;

public class ToConsonant {
    public char charConverter(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return (char) (ch + 1);

            default:
                return ch;
        }
    }
}
