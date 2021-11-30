package methodpass.windows;

public class One {
    public static int addOne(int number) {
        number += 1;
        return number;
    }

    public static void main(String[] args) {
        int number = 1;
        System.out.println(number);
        number += 1;
        System.out.println(number);
        System.out.println(One.addOne(number));
        System.out.println(number);
    }
}
