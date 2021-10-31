package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        SolarSystem ss = SolarSystem.EARTH;
        System.out.println(ss.name());
        System.out.println(ss.ordinal());
        System.out.println(ss);
        System.out.println(ss.getMOONS());
    }
}
