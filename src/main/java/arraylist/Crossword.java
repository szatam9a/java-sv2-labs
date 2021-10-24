package arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {

    List<String> gameList = Arrays.asList("KULCS", "KÁLYHA",
            "LÓ","AJTÓ", "CSERESZNYEFA", "TEJ","FELHŐ", "CIPŐ",
            "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");
        System.out.println(gameList.size());
        System.out.println(gameList.toString());
        for (String elem:gameList
             ) {if (elem.length()==6) System.out.println(elem);
        }
    }
}
