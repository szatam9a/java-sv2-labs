package introexceptionthrow;



import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validator = new Validation();
        registration:System.out.println("Hello!");
        System.out.println("neved");
        String name = scanner.nextLine();
        try {
            validator.validateName(name);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        System.out.println("korod");
        String age = scanner.nextLine();
        try {
            validator.validateAge(age);
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        System.out.println("megadott adatok name: "+name+ " age: "+age);
        if (validator.isSuccesful()){
            System.out.println("Siekres regisztáció");
        } else System.out.println("Sikertelen regisztáció");

    }


}
