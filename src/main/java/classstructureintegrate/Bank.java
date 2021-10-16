package classstructureintegrate;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("név");
        String name = scanner.nextLine();
        System.out.println("számlaszám");
        String accNumber = scanner.nextLine();
        System.out.println("összeg");
        int balance = scanner.nextInt();
        scanner.nextLine();
        BankAccount account1 = new BankAccount(accNumber,name,balance);
        System.out.println(account1.getInfo());
        System.out.println("pénzfelvétel");
        account1.withdraw(scanner.nextInt());
        scanner.nextLine();
        System.out.println(account1.getBalance());
        System.out.println("pénzbefizetés");
        account1.deposit(scanner.nextInt());
        scanner.nextLine();
        System.out.println(account1.getBalance());

    }
}
