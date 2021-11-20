package introexceptionthrow;

import introexceptiontrace.numbers.Change;

public class Validation {

     private boolean succesful = true;
    void validateName(String name) {
        if (name == null || name.isBlank()) {
            succesful= false;
            throw new IllegalArgumentException("A névv null vagy üres");

        }
    }

    void validateAge(String ageString) {
        if (ageString == null || ageString.isBlank()) {
            succesful= false;
            throw new IllegalArgumentException("Üres");
        }
        for (char actual : ageString.toCharArray()
        ) {
            if (!Character.isDigit(actual)) {
                succesful= false;
                throw new IllegalArgumentException("Nem szám");
            }
        }
        if (Integer.parseInt(ageString)>120 || Integer.parseInt(ageString)<0){
            succesful= false;
            throw new IllegalArgumentException("nem megfelelő age");
        }
    }

    public boolean isSuccesful() {
        return succesful;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
