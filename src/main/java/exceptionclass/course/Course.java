package exceptionclass.course;

public class Course {
    private String name;
    private SimpleTime begin;

    @Override
    public String toString() {
        return begin + " " + name;
    }

    public Course(String name, SimpleTime begin) {
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }
}
