package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    List<String> colors = new ArrayList<>();

    public List<String> getColors(){
        return colors;
    }
    public void addLast(String string){
        colors.add(string);
    }
//    public void addFirst(String string){
//        List<String> assistList = new ArrayList<>();
//        assistList.add(string);
//        assistList.addAll(colors);
//        colors= assistList;
//    }
    public void addFirst(String string){
        colors.add(0,string);
    }
    public void removeFirst(){
            colors.remove(0);
    }
    public void removeLast(){
        colors.remove(colors.size()-1);
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("red");
        capsules.addLast("green");
        capsules.addLast("blue");
        System.out.println(capsules.getColors());
        capsules.addFirst("white");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
