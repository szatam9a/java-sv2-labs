package lambda;

import java.util.LinkedList;
import java.util.List;

public class TreeNursery {
    private List<Sapling> saplings = new LinkedList<>();

    public void prune(int maxHeight) {
        saplings.forEach(something -> something.cut(maxHeight));
    }

    void add(Sapling sapling) {
        saplings.add(sapling);
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf(sapling -> sapling.getSpecies().equals(species) && sapling.getHeight() >= minHeight);
    }
}

