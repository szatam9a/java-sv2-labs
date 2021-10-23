package arrayofarrays;

import java.time.LocalDateTime;
import java.time.YearMonth;

public class DailyValues {

    public int[][] getValues(){

        LocalDateTime ld = LocalDateTime.now();
        YearMonth jm;

        int[][] array = new int[12][];

        for (int i= 0; i<12;i++)
        {
            jm = YearMonth.of(ld.getYear(),i+1);
            array[i] = new int[jm.lengthOfMonth()];
        }

//        for (int i[]:array) {
//            for (int j:i) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        for (int i = 0; i< array.length ; i++) {
            for (int j = 0; j<array[i].length ; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    return array;}
}

