package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    List<String> lognNameGroup= new ArrayList<>();
    List<String> shortNameGroup= new ArrayList<>();

    public void printStudyGroups(List<String> students){
        for (String names:students
             ) { if(names.length()>9) {
            lognNameGroup.add(names);
        } else {
            shortNameGroup.add(names);}
        }
        System.out.println("Logname guys:"+ lognNameGroup.toString());
        System.out.println("shotname guys:"+ shortNameGroup.toString());
    }


    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        String random = "String";
        boolean longening= false;
        for (int i = 0; i < 10 ; i++) {
            if (longening){
                students.add("Jhon Doe"+random);}
            else{
                students.add("Jhon Doe");
            }
            longening=!longening;
        }
        StudyGroup sg = new StudyGroup();
        sg.printStudyGroups(students);

    }
}

