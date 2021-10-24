package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size){
        int [][] table = new int [size][size];
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                table[i][j]= (i+1)*(j+1);
            }
        }
        return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day,anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        int min = day.length<anotherDay.length?day.length: anotherDay.length;
        double[] testArrayDay = Arrays.copyOfRange(day,0,min);
        double[] testArrayAnotherDay = Arrays.copyOfRange(day,0,min);
        return Arrays.equals(testArrayDay,testArrayAnotherDay);
    }

    public boolean wonLottery(int[]yourNumbers, int[] winingNumbers){

        int[] copyOfYourNumbers= Arrays.copyOf(yourNumbers,yourNumbers.length);
        int[] copyOfWinningNumbers= Arrays.copyOf(winingNumbers,yourNumbers.length);
        Arrays.sort(copyOfYourNumbers);
        Arrays.sort(copyOfWinningNumbers);

        return Arrays.equals(copyOfYourNumbers,copyOfWinningNumbers);
    }



    public static void main(String[] args) {
        ArraysMain am = new ArraysMain();
        System.out.println(am.numberOfDaysAsString());
        int size=3;
        System.out.println(am.multiplicationTableAsString(size));

        double[] day= {1,2,3,4,5};
        double[] anotherDay= {1,2,3,4,5,6};
        System.out.println(am.sameTempValuesDaylight(day,anotherDay));

        int[] yourNumbers =  {1,2,3,4,5};
        int[] winningNumbers = {1,3,2,4,5};
        int[] controlArray = {1,3,2,4,5};
        System.out.println(am.wonLottery(yourNumbers,winningNumbers));
        System.out.println(Arrays.equals(controlArray,winningNumbers));
    }
}
