package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person = new Person("Jhon","emailaddress","tajnumberasString","phonenumberassstring");
        Person person1 = new Person("Jhon","emailaddress","tajnumberasString","phonenumberassstring");
        Student student = new Student(person,"neptunnumberasStrin","Studentid AsString");
        Student student1 = new Student(person1,"neptunnumberasStrin","Studentid AsStrin");
        University uni = new University();
        uni.addStudent(student);
        System.out.println(uni);
        System.out.println(uni.areEqual(student,student1));

    }

}
