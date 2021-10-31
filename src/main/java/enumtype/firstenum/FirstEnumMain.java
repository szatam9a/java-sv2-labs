package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        Continent cont ;
        System.out.println(Continent.AFRICA);
        System.out.println(Continent.ANTARCTICA);
        System.out.println(Continent.ASIA);
        System.out.println(Continent.NORTH_AMERICA);
        System.out.println(Continent.SOUTH_AMERICA);
        System.out.println(Continent.EUROPE);
        System.out.println("-----------");
        System.out.println(Arrays.toString(Continent.values()));
        System.out.println("-----------");
        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println("-----------");
        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.STRIKER.name());
        System.out.println(Football.WINGER.name());
    }
}
