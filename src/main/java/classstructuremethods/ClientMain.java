package classstructuremethods;
import java.util.Scanner;
public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        client.setAddress("jó utca 16");
        client.setName("janika");
        client.setYear(16);
        System.out.println(client.getAddress());
        System.out.println(client.getName());
        System.out.println(client.getYear());
        client.migrate("Pisa utca 8");
        System.out.println(client.getAddress());
    }
}
