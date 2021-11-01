package stringbasic;

public class Person {
    private String name;
    private String emailAddress;
    private String TAJnumbers;
    private String phoneNumber;

    public Person(String name, String emailAddress, String TAJnumbers, String phoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.TAJnumbers = TAJnumbers;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", TAJnumbers='" + TAJnumbers + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTAJnumbers() {
        return TAJnumbers;
    }

    public void setTAJnumbers(String TAJnumbers) {
        this.TAJnumbers = TAJnumbers;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
