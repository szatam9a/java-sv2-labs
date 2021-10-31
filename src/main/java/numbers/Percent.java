package numbers;

public class Percent {
    public double getValue(int number, int percent){
                return ((double) number*percent/100);

    }
    public double getBase(int number, int percent){
        return (number*100/percent);

    }
    public double getpercent(int first, int second){
        return ((double)second/first*100) ;

    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        System.out.println(percent.getValue(100,33));
        System.out.println(percent.getBase(33,33));
        System.out.println(percent.getpercent(9,5));
    }
}
