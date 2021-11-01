package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person = new Person("Jhon","emailaddress","tajnumberasString","phonenumberassstring");
        Student student = new Student(person,"neptunnumberasStrin","Studentid AsString");
        University uni = new University();
        uni.addStudent(student);
        System.out.println(uni);

    }

}
