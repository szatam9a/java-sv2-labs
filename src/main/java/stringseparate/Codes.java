package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {
    private List<String> codes = Arrays.asList("csoki", "vanília", "eper", "4544564654asdasdas", "citrom", "puncs", "T57fbj", "xtcu45", "f578GVHd");

    String getCodesStartWithLetter(List<String> codes) {

        StringBuilder sb = new StringBuilder();
        sb.append("Betűvel kezdődő kódok: ");

        boolean dontPutDot = true;

        for (String actual : this.codes
        ) {
            if (Character.isAlphabetic(actual.charAt(0))) {
                if (dontPutDot) {
                    dontPutDot = !dontPutDot;
                    sb.append(actual);
                } else {
                    sb.append(", ");
                    sb.append(actual);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        System.out.println(codes.getCodesStartWithLetter(codes.codes));

    }
}
