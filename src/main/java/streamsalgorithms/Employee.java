package streamsalgorithms;

import java.time.LocalDateTime;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public Employee() {
    }

    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("Joe", 1990),
                new Employee("Jack", 2010),
                new Employee("Annie", 1970),
                new Employee("Lara", 2010),
                new Employee("Craft", 2000),
                new Employee("Rontó Ralph", 1999)
        );
        //Összegezd az alkalmazottak születési éveit!
        int sumBirthYears = list.stream().mapToInt(i -> i.yearOfBirth).sum();
        System.out.println(sumBirthYears);
        //Összegezd az alkalmazottak életkorát!
        int sumAge = list.stream().mapToInt(i -> LocalDateTime.now().getYear() - i.yearOfBirth).sum();
        System.out.println(sumAge);
        //Add vissza streammel, hány alkalmazott van a listában!
        System.out.println(list.stream().count());
        //Add vissza, hány alkalmazott született 1990-nél korábban!
        System.out.println(list.stream().filter(e -> e.yearOfBirth < 1990).count());
        //Add vissza a legkorábban született alkalmazott születési évét!
        OptionalInt firstGuy = list.stream().mapToInt(e -> e.yearOfBirth).min();
        System.out.println(list.stream().mapToInt(e -> e.yearOfBirth).min());
        //Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)

        //System.out.println(list.stream().filter(e -> e.yearOfBirth == firstGuy.getAsInt()).findFirst());

        System.out.println(list.stream().sorted((o1, o2) -> o1.yearOfBirth - o2.yearOfBirth).findFirst().map(e -> e.getName()));

        //Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?
        System.out.println(list.stream().allMatch(e -> e.yearOfBirth < 1980));
        //Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!
        List<Employee> before1990 = list.stream()
                .filter(e -> e.yearOfBirth < 1990)
                .collect(Collectors.toList());
        System.out.println(before1990);
        //Add vissza egy listában az összes alkalmazott nevét!
        List<String> names = list.stream().map(e -> e.name).collect(Collectors.toList());
        System.out.println(names);
        //Az előző két feladat kombinációja: Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!
        System.out.println(list.stream().filter(e -> e.yearOfBirth < 1990).map(e -> e.name).collect(Collectors.toList()));

    }
}
