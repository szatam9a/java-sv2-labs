package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> intList){
        int maxValue = Integer.MIN_VALUE;
        for (int i:intList
             ) {
            if (i>maxValue){
                maxValue=i;
            }
        }
    return maxValue;}
}
