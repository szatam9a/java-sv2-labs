package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text) {
        String tempText = "";
        for (char c : text.toCharArray()
        ) {
            if (Character.isWhitespace(c)) {
                tempText += "*";
            } else {
                tempText += c;
            }
        }
        return tempText;
    }

    public static void main(String[] args) {
        Whitespace white = new Whitespace();
        System.out.println(white.makeWhitespaceToStar("never let me go"));
    }
}
