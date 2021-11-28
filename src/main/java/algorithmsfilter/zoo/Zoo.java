package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listOfAnimals;

    public void addAnimal(Animal animal){
        listOfAnimals.add(animal);
    }

    public Zoo(List<Animal> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs){
        List<Animal> result= new ArrayList<>();
        for (Animal actual: listOfAnimals
             ) {
            if (actual.getNumberOfLegs()==numberOfLegs){
                result.add(actual);
            }
        }
    return result;}
}
