package polymorphism.river;

public interface Water {
    default String getName(){
        return "joe";
    }

}
