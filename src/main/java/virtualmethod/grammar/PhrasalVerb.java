package virtualmethod.grammar;

public class PhrasalVerb extends Verb implements Preposition{
    protected String preposition;

    @Override
    public String getPreposition() {
        return preposition;
    }

    public PhrasalVerb(String word, String preposition) {
        super(word);
        this.preposition = preposition;
    }

    @Override
    public String getWholeWord() {
        return preposition+word;
    }
}
