package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> list, int number){
        for (int actual:list
             ) {
            if (actual<number){return true;}
        }
    return false;}
}
