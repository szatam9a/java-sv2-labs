package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("10");
        coffee.setPrice(10);
        System.out.println(coffee.getName()+","+coffee.getPrice());
        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("10");
        cappuccino.setPrice(10);
        System.out.println(cappuccino.getName()+","+cappuccino.getPrice());
    }
}
