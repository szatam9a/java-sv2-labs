package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students= new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent){
        if ((student.getStudentID()==anotherStudent.getStudentID()) &&
                (student.getNeptunNumbers()==anotherStudent.getNeptunNumbers()) ){
            return true;
        }
    return false;}

    @Override
    public String toString() {
        return "University{" +
                "students=" + students +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }
}
