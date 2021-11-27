package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> listInt, int limit){
        int sum = 0;
        for (int i:listInt
             ) {
            if (i>limit){
                sum++;
            }
        }
    return sum;}
}
