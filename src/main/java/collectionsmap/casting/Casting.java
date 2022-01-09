package collectionsmap.casting;

import java.util.Map;

public class Casting {
    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        Integer next = Integer.MAX_VALUE;

        for (Integer i : applicants.keySet()) {
            System.out.println(next);
            System.out.println(i);
            if (i < next && i > lastNumber)
                next = i;
        }
        return applicants.get(next);
    }
}
