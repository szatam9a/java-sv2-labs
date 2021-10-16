package classstructureio;
import java.util.Scanner;
public class registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userEmail;
        String userName;
        System.out.println("Whats your name?");
        userName = scanner.nextLine();
        System.out.println("Whats your Email address?");
        userEmail = scanner.nextLine();
        System.out.println("Your name:" + userName);
        System.out.println("Your email address:" + userEmail);
    }
}
