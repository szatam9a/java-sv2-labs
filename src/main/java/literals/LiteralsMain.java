package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        String one = "1";
        String two = "2";
        String onePlusTwo = "1"+"2";
        onePlusTwo= one+two;
        System.out.println("1"+"2");
        double quotient =3/4;
        quotient = (double) 3/4;
        //quotient = 3.0/4.0;
        System.out.println(quotient);
        long big = 3_244_444_444L;
        System.out.println(big);
        String word= "title";
        System.out.println(word.toUpperCase());
        System.out.println(Integer.toString(1,2));
        System.out.println(Integer.toString(-2,2));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
