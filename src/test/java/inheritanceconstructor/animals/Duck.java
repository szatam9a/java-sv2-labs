package inheritanceconstructor.animals;

public class Duck implements Animal{
    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public String getName() {
        return "Duck";
    }
}
