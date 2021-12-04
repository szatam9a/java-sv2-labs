package inheritanceattributes.building;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("name",2, 2);
        SchoolBuilding schoolBuilding = new SchoolBuilding(2);
        System.out.println(building.name+" "+building.area+" " +building.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
