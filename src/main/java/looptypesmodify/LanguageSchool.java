package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student petya = new Student();
        Student pista = new Student();
        students.add(petya);
        students.add(pista);
        System.out.println(students.size());
        pista.setActive(false);
        for (int i = 0; i < students.size() ; i++) {
            if (!students.get(i).isActive()) {
                students.remove(i);
            }
        }
        System.out.println(students.size());
    }
}
