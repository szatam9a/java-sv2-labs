package introexceptionthrowjunit4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> list = new ArrayList<>();

    void addNote(int note) {
        if (note >5 || note < 1 ){
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
        list.add(note);
    }

    public List<Integer> getList() {
        return list;
    }

    public int getListElement(int index){
        return list.get(index);
    }
    public void setList(List<Integer> list) {
        this.list = list;
    }
}
