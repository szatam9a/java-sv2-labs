package collectionsset.physicaleducation;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> list) {
        Set result = new TreeSet();
        for (Student s : list) {
            result.add(s.getHeight());
        }
        return result;
    }

    public static void main(String[] args) {
        PhysicalEducation gym = new PhysicalEducation();
        System.out.println(
                gym.getOrderInLessons(List.of(new Student("Jhony", 1), new Student("Jhony", 3),
                        new Student("Jhony", 2))));
    }
}
