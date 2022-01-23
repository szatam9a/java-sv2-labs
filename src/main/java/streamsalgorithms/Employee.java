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

        int sumBirthYears = list.stream().mapToInt(i -> i.yearOfBirth).sum();
        System.out.println(sumBirthYears);
        int sumAge = list.stream().mapToInt(i -> LocalDateTime.now().getYear() - i.yearOfBirth).sum();
        System.out.println(sumAge);
        System.out.println(list.stream().count());
        System.out.println(list.stream().filter(e -> e.yearOfBirth < 1990).count());
        OptionalInt firstGuy = list.stream().mapToInt(e -> e.yearOfBirth).min();
        System.out.println(list.stream().mapToInt(e -> e.yearOfBirth).min());
        System.out.println(list.stream().filter(e -> e.yearOfBirth == firstGuy.getAsInt()).findFirst());
        System.out.println(list.stream().allMatch(e -> e.yearOfBirth < 1980));
        List<Employee> before1990 = list.stream().filter(e -> e.yearOfBirth < 1990).collect(Collectors.toList());
        System.out.println(before1990);
        List<String> names = list.stream().map(e -> e.name).collect(Collectors.toList());
        System.out.println(names);
        System.out.println(list.stream().filter(e -> e.yearOfBirth < 1990).map(e -> e.name).collect(Collectors.toList()));

    }
}
