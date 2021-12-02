package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    private List<String> students = Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla",
            "Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér");
    ;

    public String getTodayReferringStudent(int number) {

        return students.get((number - 1));
    }

    public String getTodayReferringStudent(Number number) {
        return students.get(number.getNumber() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        System.out.println(numberName);
        System.out.println(Number.valueOf(numberName.toUpperCase()).getNumber());
        System.out.println(Number.valueOf(numberName.toUpperCase()).getNumber() - 1);
        return students.get(Number.valueOf(numberName.toUpperCase()).getNumber() - 1);
    }
}
