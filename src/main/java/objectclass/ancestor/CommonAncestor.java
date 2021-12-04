package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Starking());
        list.add(new Vegetable());
        list.add("alma");
        list.add(12);
        list.add("x");
        list.add(LocalDate.now());
        int[] numbers = {1,2,3,4,5,6,7};
        list.add(numbers);
        list.add(Arrays.asList("tonika","tutu","pingban"));
        for (Object o:list
             ) {
            System.out.println(o);
        }
    }
}
