package interfacedependencyinversion.vaccine;

public class Person {
    private String name;
    private int age;
    private ChronicDisease chronic;
    private Pregnancy pegnant;

    public Person(String name, int age, ChronicDisease chronic, Pregnancy pegnant) {
        this.name = name;
        this.age = age;
        this.chronic = chronic;
        this.pegnant = pegnant;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ChronicDisease getChronic() {
        return chronic;
    }

    public Pregnancy getPegnant() {
        return pegnant;
    }
}
