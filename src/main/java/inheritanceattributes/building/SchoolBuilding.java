package inheritanceattributes.building;

public class SchoolBuilding {
    private int numberOfClassRooms;

    public SchoolBuilding(int numberOfClassRooms) {
        this.numberOfClassRooms = numberOfClassRooms;
    }

    public int getNumberOfClassRooms() {
        return numberOfClassRooms;
    }

    public void setNumberOfClassRooms(int numberOfClassRooms) {
        this.numberOfClassRooms = numberOfClassRooms;
    }
}
