package lambdaintermediate;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongWords {
    private List<String> words = new LinkedList<>();

    public List<String> getWords() {
        return words;
    }

    public long getNumberOfWordsStartWith(String keyWord) {
        return words.stream().filter((e) -> e.startsWith(keyWord)).count();
    }

    public List<String> getLongerWords(int number) {
        return words.stream().filter(e -> e.length() > number).collect(Collectors.toList());
    }

    public Optional<String> getShortestWordContainingGivenCharacter(char character) {
        return words.stream().filter(e -> e.indexOf(character) >= 0).min(Comparator.comparing(String::length));
    }
}
