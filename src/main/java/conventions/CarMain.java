package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car kocsim = new Car("Trabant", "v6", 6, 10);
        kocsim.setDoors(5);
        kocsim.setCarType("Volvo");
        kocsim.setEngineType("v120");
        kocsim.setPersons(8);
        System.out.println(kocsim.getDoors());
        System.out.println(kocsim.getPersons());
        System.out.println(kocsim.getCarType());
        System.out.println(kocsim.getEngineType());
        kocsim.addModelName("GTX 1080");
        System.out.println(kocsim.getCarType());

    }
}
