package intromethods.registration;

import java.time.LocalDate;

public class Person {
    String name;
    LocalDate dateOfBirth;
    String email;

    @Override
    public String toString() {
        return  "Neve ='" + name +
                ", Születési idő=" + dateOfBirth +
                ", email cím='" + email +
                '}';
    }

    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }
}
