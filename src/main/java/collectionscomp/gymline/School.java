package collectionscomp.gymline;

import java.text.Collator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class School {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        students.add(new Student("jó", 12));
        students.add(new Student("gerike", 13));
        students.add(new Student("napolopo", 11));
        students.add(new Student("goodguy", 10));
        System.out.println(students);
        Map<String, Integer> maps = new TreeMap<>(Collator.getInstance());
        for (Student s : students) {
            maps.put(s.getName(),s.getHeight());
        }
        System.out.println(maps);
    }
}
