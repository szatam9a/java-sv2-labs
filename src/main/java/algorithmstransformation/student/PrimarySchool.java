package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> listOfEverybody;

    public PrimarySchool(List<Person> listOfEverybody) {
        this.listOfEverybody = listOfEverybody;
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person actual : listOfEverybody
        ) {
            if (actual.getAge() >= 6 && actual.getAge() <= 14) {
                students.add(new Student(actual.getName(), actual.getAddress()));
            }
        }
        return students;
    }

    public void addPerson(Person person) {
        listOfEverybody.add(person);
    }

    public List<Person> getListOfEverybody() {
        return listOfEverybody;
    }
}
