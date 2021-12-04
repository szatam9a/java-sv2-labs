package objectclass.SimpleBag;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private int cursor = -1;
    private List<Object> items = new ArrayList<>();

    public SimpleBag() {

    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursor = -1;
    }

    public boolean hasNext() {
        if (items.size() > cursor) {
            return true;
        } else return false;
    }

    public Object next() {
        cursor++;
        return items.get(cursor);
    }

    public boolean contains(Object item) {
        if (items.contains(item)) {
            return true;
        } else return false;
    }

    public int getCursor() {
        return cursor;
    }

    ;

}
