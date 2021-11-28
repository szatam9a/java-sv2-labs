package algorithmstransformation.letters;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> list){
        List<String> result = new ArrayList<>();
        for (String actual:list
             ) {
              result.add(actual.substring(0,2));
        }
    return result;}
}
