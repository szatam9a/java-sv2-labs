package packages.NameMain;

import packages.Firstname.Firstname;
import packages.Lastname.Lastname;
import packages.Prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("prefix");
        Lastname lastname = new Lastname("Lastname");
        Firstname fistanem = new Firstname("Firstname");
        System.out.println(prefix.getPre()+" "+ fistanem.getFirst()+" "+ lastname.getLast());
    }
}
