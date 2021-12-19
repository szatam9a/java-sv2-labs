package interfacerules.sharedattributes;

public class Equator implements Name, Length {
    private static final String NAME = "Name";
    private static final double LENGTH = 1;


    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public Equator() {
    }
}
