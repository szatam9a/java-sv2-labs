package newbie;

public class Newbie {
    public static void main(String[] args) {
        Newbie n2 = new Newbie();
        Newbie n1 = new Newbie();
        Newbie n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
