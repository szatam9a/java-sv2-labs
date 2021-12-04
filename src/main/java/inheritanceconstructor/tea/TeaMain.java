package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("nam",1);
        HerbalTea herbalTea = new HerbalTea("name",2);
        System.out.println(tea);
        System.out.println(herbalTea);
    }
}
