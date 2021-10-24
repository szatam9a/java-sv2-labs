package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("Pénz","Kaktusz","Kokonut");

        System.out.println(importantThings.toString());
        importantThings.set(0,"KUka");
        System.out.println(importantThings.toString());
    }
}
