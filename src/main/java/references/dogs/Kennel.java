package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> doglist = new ArrayList<>();
        Dog dog1 = new Dog("Dzsoni",10,"fekte");
        Dog dog2 = new Dog("JhonDoe",10,"fekte");
        Dog dog3 = new Dog("Dzsudlo",10,"fekte");
        doglist.add(dog1);
        doglist.add(dog2);
        doglist.add(dog3);
        System.out.println(doglist.toString());
        Dog dog4 = doglist.get(1);
        dog4.setColour("Pézsma");
        Dog dog5 = new Dog("Béla",12,"sárga");
        System.out.println(doglist);
        System.out.println(dog5);
        doglist.add(dog5);
        System.out.println(doglist);
        Dog dog6 = dog4;
        List<Dog> anotherlist = doglist;
        System.out.println(anotherlist);
        dog2.setColour("petrezselyem");
        System.out.println(anotherlist);
        dog2= null;
        System.out.println(dog2);
        System.out.println(doglist);
        Dog dog9 = dog1;
        dog9.setColour("alma");
        System.out.println(anotherlist);



    }
}
