package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Születési név");
        String name = scanner.nextLine();
        System.out.println("Születési év");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Születési hónap sorszáma");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Születési nap száma");
        int day = scanner.nextInt();
        scanner.nextLine();
        Employee newemploye = new Employee(year,month,day, name);
        System.out.println(
                "Munkavállaló neve: "+newemploye.getName() + System.lineSeparator()
                +"Munkábalépés időpontja: "+ newemploye.getBeginEmployment() + System.lineSeparator()
                +"Munakvállaló születésénak időpontja: "+ newemploye.getDateOfBirth());
    }
}
