package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private  List<Person> assignedToExam = new ArrayList<>();

    public void addPerson(Person person){
        assignedToExam.add(person);

    }
    public List<Person> getAssignedToExam() {
        return assignedToExam;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "assignedToExam=" + assignedToExam +
                '}';
    }
}
