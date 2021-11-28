package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> intList){
        int minValue= Integer.MAX_VALUE;
        for (int i:intList
             ) {
             if (minValue>i){
                 minValue=i;
             }
        }
    return minValue;}
}
