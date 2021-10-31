package operators;

public class Operators {
    public void writeBinary(int number) {
        System.out.println(Integer.toString(number, 2));
    }

    public boolean isEven(int n) {
        boolean b = n % 2 == 0;
        return b;
    }

    public String getResultOfDivision(int number, int divisor) {
        String solution;
        solution= number +" / "+divisor  +" = "+ (number/divisor) +", Maradék: "+ (number%divisor);
        return solution;
    }
    public String isNull(String s){
        return (s ==(null))?"null értékű":"nem null értékű";
    }
    public boolean isEmpty(String s){

        return ( s ==null || s.equals(""))?true:false;
    }
}
