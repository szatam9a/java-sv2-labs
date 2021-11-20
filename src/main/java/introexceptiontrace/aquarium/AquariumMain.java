package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Fish clown = new Fish("meh", "kék");
        Fish goldie = new Fish("meh", "sarga");
        Aquarium aquarium = new Aquarium();
        aquarium.addFish(clown);
        aquarium.addFish(goldie);
        System.out.println(aquarium.getNumberOfFish());

    }
}
