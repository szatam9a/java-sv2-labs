package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        System.out.println(CircleCalculator.PI);
        System.out.println(CircleCalculator.calculateArea(5));
        System.out.println(CircleCalculator.calculatePerimeter(5));
        System.out.println(CylinderCalculatorBasedOnCircle.calculateArea(5));
        System.out.println(CylinderCalculatorBasedOnCircle.calculatePerimeter(5));
        System.out.println(CylinderCalculator.calculateSurfaceArea(5,5));
        System.out.println(CylinderCalculator.calculateVolume(5,6));

    }
}
