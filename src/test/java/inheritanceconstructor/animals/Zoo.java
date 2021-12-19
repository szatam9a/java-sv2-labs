package inheritanceconstructor.animals;

import java.util.List;

public class Zoo {
    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    private List<Animal> animals;

    int getNumberOfAllLegs() {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.getNumberOfLegs();
        }
        return sum;
    }

    int getNumberOfAllAnimals() {
        return animals.size();
    }
}
