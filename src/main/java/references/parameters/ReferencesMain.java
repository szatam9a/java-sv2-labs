package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person = new Person("Filip", 16);
        Person person1 = new Person("Filip", 26);
        Person person2 = new Person("Filip", 36);
        person = person2;
        person1 = person;
        person1.setName("joe");

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        int int1 = 6;
        int int2 = 7;
        int1=int2;
        int2++;
        System.out.println(int1 +" "+ int2);


    }
}
