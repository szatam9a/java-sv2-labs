package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    private List<String> theFlowers = new LinkedList<>();

    public BunchOfFlowers(List<String> theFlowers) {
        this.theFlowers = theFlowers;
    }

    public BunchOfFlowers() {
    }

    public void addFlowerInTheMiddle(String flower){
        int theSize = theFlowers.size();
        if (theSize%2==0){
            theFlowers.add(theSize/2,flower);
            return;
        }
        theFlowers.add((theSize/2)+1,flower);
        theFlowers.add((theSize/2),flower);
    }

    public List<String> getTheFlowers() {
        return theFlowers;
    }
}
