package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        Position boss = Position.CEO;
        System.out.println(boss.getBenefit());
        System.out.println(boss.getSalary());
        System.out.println(boss);
    }
}
