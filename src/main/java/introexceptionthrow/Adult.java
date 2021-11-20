package introexceptionthrow;

public class Adult {
    private String name;
    private int age;

    public Adult(String name, int age) {
        if (age<18){
            throw new IllegalArgumentException("FIATALKORÚ");
        }
        this.name = name;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
