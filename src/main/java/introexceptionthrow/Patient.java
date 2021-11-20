package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year){

        this.name = name;
        if (name.isBlank()||name==null){
            throw new IllegalArgumentException("Üres név");
        }
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;
        if (year<1900){
            throw new IllegalArgumentException("1900 előtt született");
        }
    }


    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient patient = new Patient("Joska", "1899",1899);
    }
}
