package linebreak;

public class Car {
    /*
    public static String getBrandAndTypeInSeparateLines(String brand, String type){
        System.out.print(brand + System.lineSeparator() + type);
    }
     */
    public  String getBrandAndTypeInSeparateLines(String brand, String type){
        return (brand + System.lineSeparator() + type);
    }
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getBrandAndTypeInSeparateLines("Honda","crv"));
    }

}
