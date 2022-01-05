package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String TAJ_number;

    public Person(String name, String TAJ_number) {
        this.name = name;
        this.TAJ_number = TAJ_number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", TAJ_number='" + TAJ_number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(TAJ_number, person.TAJ_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAJ_number);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jhon", "aa1");
        Person p2 = new Person("Jhon Doe", "aa1");
        Person p3 = new Person("Jhon Doe", "aaa");
        System.out.println(p1.toString() + p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.toString() + p3);
        System.out.println(p1.equals(p3));
        System.out.println(p2.toString()+p3);
        System.out.println(p2.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
