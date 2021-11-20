package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    private List<String> list = new ArrayList<>(Arrays.asList("Kutya", "Cica", "Almacsutka", "", "Répa"));

    void write() {
        try {
            for (String s : list
            ) {
                System.out.println(s.charAt(0));
            }
        } catch (StringIndexOutOfBoundsException oob){
            System.out.println("Üres Lista elem");
        }

    }

    public static void main(String[] args) {
        FirstLetter firstLetter = new FirstLetter();
        firstLetter.write();
    }
}
