package stringseparate;


import java.util.Arrays;
import java.util.List;

public class IceCream {
    private List<String> list = Arrays.asList("csoki", "vanília", "eper", "citrom", "puncs");

    public String discount() {
        StringBuilder sb = new StringBuilder();
        boolean dontputdot = true;
        sb.append("MA VAN: ");
        for (String actual : list
        ) {
            if (dontputdot) {
                dontputdot = !dontputdot;
                sb.append(actual);
            } else {
                sb.append(", ");
                sb.append(actual);
            }
        }
        sb.append(". FÉLÁRON");
        return sb.toString();
    }

    public static void main(String[] args) {
        IceCream ice = new IceCream();
        System.out.println(ice.discount());
    }
}
