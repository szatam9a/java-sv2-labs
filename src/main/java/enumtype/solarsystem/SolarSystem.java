package enumtype.solarsystem;

public enum SolarSystem {
    EARTH(1),URANUS(2),NEPTUN(3);
    private final int MOONS;

    SolarSystem(int moons) {
        MOONS = moons;
    }
}
