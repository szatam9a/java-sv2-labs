package staticattrmeth.vet;

import java.util.List;

public class Vet {
    private List<Dog> registeredDogs;
    private static long code =1;

    public List<Dog> getRegisteredDogs() {
        return registeredDogs;
    }
     public void addDog (Dog dog){
        registeredDogs.add(dog);
        dog.setCodeNumber(code);
        code++;
     }
}
