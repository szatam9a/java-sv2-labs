package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int zipCode;
    private double average;

    public Person(String name, LocalDate dateOfBirth, int zipCode, double average) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.zipCode = zipCode;
        this.average = average;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", zipCode=" + zipCode +
                ", average=" + average +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAverage() {
        return average;
    }
}
