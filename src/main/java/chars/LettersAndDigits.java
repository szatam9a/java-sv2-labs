package chars;

public class LettersAndDigits {
    public void printLetterOrDigit(String text) {
        char[] texter = text.toCharArray();
        for (char c : texter
        ) {
            if (Character.isAlphabetic(c)) {
                System.out.println(c + ": betű");
            } else {
                System.out.println(c + ": szám");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lad = new LettersAndDigits();
        lad.printLetterOrDigit("tetx6");
    }

}
