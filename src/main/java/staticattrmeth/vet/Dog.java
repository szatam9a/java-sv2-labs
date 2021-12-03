package staticattrmeth.vet;

public class Dog {
    private String name;
    private int age;
    private long  codeNumber;
    private Species species ;

    public Dog(String name, int age, long codeNumber, Species species) {
        this.name = name;
        this.age = age;
        this.codeNumber = codeNumber;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getCodeNumber() {
        return codeNumber;
    }

    public Species getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCodeNumber(long codeNumber) {
        this.codeNumber = codeNumber;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
