package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x= 5+6 ;
        int y = 11- x;
        int z = 8;
        boolean b = x>y;
        boolean c = b ||z>5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);
        System.out.println(c);
        z++;
        System.out.println(z);

    }
}
