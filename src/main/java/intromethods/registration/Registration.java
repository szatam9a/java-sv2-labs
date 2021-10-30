package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public String firstAndLastname(String first,String last ){
        return (first+" "+last);
    }
    public LocalDate birthOfPeople(int year, int month, int day){

        return LocalDate.of(year,month,day);

    }
    public static void main(String[] args) {
        Registration reg = new Registration();
        Scanner sc =  new Scanner(System.in);
        System.out.println("first name? ");
        String first = sc.nextLine();
        System.out.println("last name? ");
        String last = sc.nextLine();
        System.out.println("year of birth ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println("month  of birth ");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("day of birth ");
        int day = sc.nextInt();
        sc.nextLine();
        System.out.println("your email address");
        String email= sc.nextLine();
        Person person = new Person(reg.firstAndLastname(first,last),reg.birthOfPeople(year,month,day),email);
        System.out.println(person);

    }
}
