package stringbasic;

public class Student {
    private Person person ;
    private String neptunNumbers;
    private String StudentID;
    private int cardNumber;

    public Student(Person person, String neptunNumbers, String studentID) {
        this.person = person;
        this.neptunNumbers = neptunNumbers;
        StudentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", neptunNumbers='" + neptunNumbers + '\'' +
                ", StudentID='" + StudentID + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunNumbers() {
        return neptunNumbers;
    }

    public void setNeptunNumbers(String neptunNumbers) {
        this.neptunNumbers = neptunNumbers;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
