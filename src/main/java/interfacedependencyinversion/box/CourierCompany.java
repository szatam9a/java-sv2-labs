package interfacedependencyinversion.box;

public class CourierCompany {
    public static void main(String[] args) {
        Box box1 = new ExtraLargeBox();
        Box box2 = new LargeBox();
        Box box3 = new MediumBox();
        Box box4 = new SmallBox();
        System.out.println(box1.getPrice()+" "+box2.getPrice()+" "+box3.getPrice()+" "+box4.getPrice());
    }
}
