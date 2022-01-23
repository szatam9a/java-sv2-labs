package optional;

public class Destination {
    private String name;
    private String description;
    private int kmfFromHome;

    public Destination(String name, String description, int kmfFromHome) {
        this.name = name;
        this.description = description;
        this.kmfFromHome = kmfFromHome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getKmfFromHome() {
        return kmfFromHome;
    }

    public void setKmfFromHome(int kmfFromHome) {
        this.kmfFromHome = kmfFromHome;
    }
}
