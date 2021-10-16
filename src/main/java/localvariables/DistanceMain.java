package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(15455, true);
        System.out.println(distance.getDistanceinkm());
        System.out.println(distance.isAccurate());
        int i = (int) distance.getDistanceinkm();
        System.out.println(i);
    }
}
