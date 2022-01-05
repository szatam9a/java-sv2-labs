package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList();
        companies.add(new Company("Cég kft","1234"));
        System.out.println(companies.contains(new Company("Cég kft","1234")));
        System.out.println(companies.contains(new Company("Cég kftt","1234")));
        System.out.println(companies.contains(new Company("Cég kft","12345")));
    }
}
