package lambda;

public class Sapling {
    private String species;
    private int height; // cm


    public Sapling(int height) {
        this.height = height;
    }

    public void cut(int maxHEight) {
        if (this.height > maxHEight)
            setHeight(maxHEight);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public int getHeight() {
        return height;
    }

    public Sapling(String species, int height) {
        this.species = species;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Sapling{" +
                "species='" + species + '\'' +
                ", height=" + height +
                '}';
    }
}
