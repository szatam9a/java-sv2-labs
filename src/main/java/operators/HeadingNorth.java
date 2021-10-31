package operators;

public class HeadingNorth {
    private int rightnow=0;
    private final int aCircle = 360;

    public Integer getNumberOfNewDirections(){
        int counter=0;
        for (int i =rightnow ; i < aCircle ; i=i+counter*10) {
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        HeadingNorth people = new HeadingNorth();
        System.out.println(people.getNumberOfNewDirections());
    }
}
