package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> list, String word) {

        for (String actual : list
        ) {
            if (actual.length()>word.length()){
                return true;
            }
        }
        return false;
    }
}
