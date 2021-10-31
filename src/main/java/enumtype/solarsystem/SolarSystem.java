package enumtype.solarsystem;

public enum SolarSystem {
    EARTH(1),URANUS(2),NEPTUN(3);
    private final int MOONS;

    SolarSystem(int moons) {
        MOONS = moons;
    }

    public int getMOONS() {
        return MOONS;
    }

    @Override
    public String toString() {
        return "SolarSystem{" +
                "MOONS=" + MOONS +
                '}';
    }
}
