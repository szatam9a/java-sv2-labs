package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LostAndFoundOffice {
    private List<LostProperty> lostProperties = new ArrayList<>();

    public void addProperty(LostProperty lostProperty) {
        lostProperties.add(lostProperty);
    }

    public LostProperty findLostProperty(String description) {
        int i = Collections.binarySearch(lostProperties, new LostProperty(description));
        if (i < 0) throw new IllegalArgumentException("no lost property by " + description);
        return lostProperties.get(i);
    }
}
