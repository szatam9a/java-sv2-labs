package collectionsautoboxing.paper;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private Map<String, Integer> paper = new HashMap<>();

    public void putFurtherPaper(String className, int kilograms) {
        if (paper.keySet().contains(className)) {
            paper.put(className, paper.get(className) + kilograms);
            return;
        }
        paper.put(className, kilograms);
    }

    public Map<String, Integer> getPaper() {
        return paper;
    }

    public String getWinnerClass() {
        int best = 0;
        String winner = "";
        for (String k : paper.keySet()) {
            if (paper.get(k) > best) {
                best = paper.get(k);
                winner = k;
            }
        }
        return winner;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (Integer i : paper.values()) {
            sum += i;
        }
        return sum;
    }

}
