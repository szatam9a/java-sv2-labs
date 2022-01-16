package collectionsiterator.christmaspresent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ChristmasShopping {
    List<ChristmasPresent> surprise = new LinkedList<>();

    public void addNewPresent(ChristmasPresent present) {
        surprise.add(present);
    }

    public ChristmasShopping(List<ChristmasPresent> surprise) {
        this.surprise = surprise;
    }

    public void removeTooExpensivePresent(int maxPrice) {
        Iterator<ChristmasPresent> it = surprise.iterator();
        while (it.hasNext()) {
            if (it.next().getPrice() > maxPrice) {
                System.out.println(it);
                it.remove();
            }
        }
    }
}
