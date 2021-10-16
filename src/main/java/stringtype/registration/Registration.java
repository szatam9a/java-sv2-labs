package stringtype.registration;
import java.util.Scanner;
public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator validator = new UserValidator();
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println(validator.isValidEmail(email)? "good":"bad");
        System.out.println("jelszó");
        String password = scanner.nextLine();
        System.out.println("jelszó újra");
        String passwordagain = scanner.nextLine();
        System.out.println(validator.isValidPassword(password,passwordagain)? "good":"bad");



    }

}
