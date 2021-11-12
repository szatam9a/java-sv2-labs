package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
         List<String> people = Arrays.asList("JhonDoe", "Jhong", "Doe");


        for (String actual:people
             ) {
            System.out.printf("Kedves %s ! Örülünk, hogy termékünket választotta! \n", actual);
            
        }
    }
}
