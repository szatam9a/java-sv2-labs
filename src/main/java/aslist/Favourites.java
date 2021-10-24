package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        System.out.println(favouriteThings.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("kedvenc cuccod?");
        favouriteThings.add(sc.nextLine());
        System.out.println("kedvenc cuccod?");
        favouriteThings.add(sc.nextLine());
        System.out.println("kedvenc cuccod?");
        favouriteThings.add(sc.nextLine());
        System.out.println("lsitara mérete: "+ favouriteThings.size()+" tartlama: "+favouriteThings.toString());

    }
}
