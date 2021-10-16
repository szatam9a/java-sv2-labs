package classstructureattributes;
import java.util.Scanner;
public class ClientMain {
    public static void main(String[] args) {
        Client kliens = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" neved?");
        kliens.name = scanner.nextLine();
        System.out.println(" címed?");
        kliens.address = scanner.nextLine();
        System.out.println(" hány éves?");
        kliens.years = scanner.nextInt();
        scanner.nextLine();

        System.out.println("neved: " +kliens.name );
        System.out.println("címed: " +kliens.address);
        System.out.println("korod: " +kliens.years);
    }
}
