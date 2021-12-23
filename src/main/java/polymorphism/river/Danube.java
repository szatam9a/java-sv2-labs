package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River {
    private List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("ok", 1, (Arrays.asList(" ", "")));
        Water water1 = new Water() {
        };
        Water water2 = new River("name", 1) {
        };

        Water water3 = new Danube("ok", 1, (Arrays.asList(" ", "")));
        Danube water4 = new Danube("ok", 1, (Arrays.asList(" ", "")));
        River water7 = new Danube("ok", 1, (Arrays.asList(" ", "")));
    }
}
