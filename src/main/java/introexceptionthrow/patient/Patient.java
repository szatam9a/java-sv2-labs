package introexceptionthrow.patient;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year){
        SsnValidator ssnValidator = new SsnValidator();
        this.name = name;
        if (name.isBlank()||name==null){
            throw new IllegalArgumentException("Üres név");
        }

        this.socialSecurityNumber = ssn;
        ssnValidator.isValidSSN(ssn);
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
        Patient firstPatient = new Patient("Kiss József", "sssssssss", 1954);

        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());

//        Patient secondPatient = new Patient("", "123456788", 1954);
//
//        System.out.println(secondPatient.getName());
//        System.out.println(secondPatient.getSocialSecurityNumber());
//        System.out.println(secondPatient.getYearOfBirth());

        Patient thirdPatient = new Patient("Kiss József", "1234s6789", 1954);

        System.out.println(thirdPatient.getName());
        System.out.println(thirdPatient.getSocialSecurityNumber());
        System.out.println(thirdPatient.getYearOfBirth());

//        Patient fourthPatient = new Patient("Kiss József", "123456788", 1888);
//
//        System.out.println(fourthPatient.getName());
//        System.out.println(fourthPatient.getSocialSecurityNumber());
//        System.out.println(fourthPatient.getYearOfBirth());
  }





}
