package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store alaszka = new Store("hóember");
        Store egyiptom = new Store("piramis");
        System.out.println(alaszka.getStock());
        System.out.println(egyiptom.getStock());

        alaszka.dispatch(2);
        System.out.println(alaszka.getProduct());
        System.out.println(alaszka.getStock());
        egyiptom.dispatch(3);
        System.out.println(egyiptom.getProduct());
        System.out.println(egyiptom.getStock());
        alaszka.store(4);
        System.out.println(alaszka.getProduct());
        System.out.println(alaszka.getStock());
        egyiptom.store(5);
        System.out.println(egyiptom.getProduct());
        System.out.println(egyiptom.getStock());


    }
}
