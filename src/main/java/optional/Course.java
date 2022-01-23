package optional;

public class Course {
    private String name;
    private Level intensity;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getIntensity() {
        return intensity;
    }

    public void setIntensity(Level intensity) {
        this.intensity = intensity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Course(String name, Level intensity, int price) {
        this.name = name;
        this.intensity = intensity;
        this.price = price;
    }
}
