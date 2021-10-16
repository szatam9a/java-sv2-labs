package classstructureintegrate;
import java.util.Scanner;
public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("add neg a termék nevét");
        String product = scanner.nextLine();
        System.out.println("add neg a termék árát");
        int price = scanner.nextInt();
        scanner.nextLine();
        Product product1 = new Product(product, price);
        System.out.println(product1.getName() + product1.getPrice());
    }
}
