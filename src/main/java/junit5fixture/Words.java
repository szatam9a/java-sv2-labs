package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> list = new ArrayList<>();

    public void addWord(String word) {
        list.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> toRemove = new ArrayList<>();
        for (String actual : list
        ) {
            if (!actual.startsWith(prefix)) {
                toRemove.add(actual);
            }
        }
        list.removeAll(toRemove);
    }

    public void getWordsWithLength(int length) {
        List<String> toRemove = new ArrayList<>();
        for (String actual : list
        ) {
            if ((actual.length() != length)) {
                toRemove.add(actual);
            }
        }
        list.removeAll(toRemove);
    }

    public List<String> getList() {
        return list;
    }
}
