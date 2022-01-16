package collectionscomp.gymline;

public class Student {
    private String name;
    private int height;

    @Override
    public String toString() {
        return "Student{" +
                "height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int height) {
        this.height = height;
    }
}
