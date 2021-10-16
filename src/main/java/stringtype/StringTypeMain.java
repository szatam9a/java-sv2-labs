package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "Jhon Doe";
        String message = prefix+name;
        String mess = "Hello John Doe444";
        message= message+444;
        System.out.println(prefix);
        System.out.println(name);

        System.out.println(message);
        System.out.println("Hello John Doe444");
        boolean b = message.equals("Hello John Doe");
        System.out.println(b);

        boolean c = message.equals("Hello John Doe444");
        System.out.println(message.equals(mess));
        System.out.println(c);
        String s1 = "";
        String s2 = "";
        String s3 = s1+s2;
        System.out.println(s3);
        System.out.println(s3.length());
        String testme = "Abcde";
        System.out.println(testme.length());

    }

}
