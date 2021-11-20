package introexceptionmoreexceptions;

import java.util.Locale;

public class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);
        System.out.println(person);
        System.out.println(person.name);
        // System.out.println(person.getName().toUpperCase(Locale.ROOT));// kivétel. nincs string érték amit át lehet alakítani a változó állapota "null" nincs defeiniálva
    }
}

