package introexceptionthrow.patient;

public class SsnValidator {
    public void isValidSSN(String ssn){
        int accumulator=0;
        if (ssn.length()!=9) {throw new IllegalArgumentException("Nem 9 karakter");}
        for (int i = 0; i < ssn.length() ; i+=2) {
            accumulator=ssn.charAt(i);
        }
        if (accumulator%10!=ssn.charAt(8)){
            throw new IllegalArgumentException("Nem megfelelő ellenőrző kód");
        }

        }
    }
