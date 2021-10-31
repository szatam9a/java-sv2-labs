package primitivetypes.exam;

import javax.swing.text.html.HTMLDocument;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("név?: ");
        String name = sc.nextLine();
        System.out.println("irányítószám? ");
        String zipcode = sc.nextLine();
        System.out.println("átlag? : ");
        String average = sc.nextLine();
        System.out.println("születési év?: ");
        String yearOfBirth = sc.nextLine();
        System.out.println("hányadik honapban született?: ");
        String monthOfBirth =sc.nextLine();
        System.out.println("a honap hanyadik napján született?: ");
        String dayOfBirth =sc.nextLine();
        LocalDate dateOfBirth= LocalDate.of(Integer.parseInt(yearOfBirth),Integer.parseInt(monthOfBirth),Integer.parseInt(dayOfBirth));
        LocalDate dateOfDate = LocalDate.parse(yearOfBirth+"-"+monthOfBirth+"-"+dayOfBirth);
        System.out.println(dateOfDate);
        Person person = new Person(name,dateOfDate,Integer.parseInt(zipcode),Double.parseDouble(average));
        Exam exam = new Exam();
        exam.addPerson(person);
        System.out.println(person);
        System.out.println(exam);
    }
}
