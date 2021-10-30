package composition.person;

public class Person {
    String name;
    String identificationCard;
    Address address;

    public String personToString() {
        return name + " " + identificationCard;
    }

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void moveTo(Address address){
        this.address=address;
    }

    public Address getAddress() {
        return address;
    }

    public void correctData(String name, String identificationCard) {
        this.identificationCard = identificationCard;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }
}
