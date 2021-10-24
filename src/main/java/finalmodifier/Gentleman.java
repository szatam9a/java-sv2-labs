package finalmodifier;

public class Gentleman {
    final String MESSAGE_PREFIX = "cool";
    public String sayHello(String name){
        name= MESSAGE_PREFIX+name;
    return name;}

    public static void main(String[] args) {
        Gentleman gm= new Gentleman();
        System.out.println(gm.sayHello("jhon"));
    }
}
