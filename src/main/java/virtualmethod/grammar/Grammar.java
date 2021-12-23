package virtualmethod.grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verb = new PhrasalVerb("a", "n");
        System.out.println(verb.getWord());
        Verb verb2 = new PhrasalVerbWithSuffix("a", "n", "c");
        System.out.println(verb2.getWord());
        Preposition prep = new PhrasalVerb("a", "n");
        System.out.println(prep.getPreposition()+" "+prep.getWholeWord());
        Preposition prep2 = new PhrasalVerbWithSuffix("a", "n", "c");
        System.out.println(prep2.getPreposition()+" "+prep.getWholeWord());
        PhrasalVerb p_verb = new PhrasalVerb("a", "n");
        System.out.println(p_verb.getPreposition()+" "+p_verb.getWholeWord()+" "+p_verb.getWord());
        PhrasalVerb p_verb2 = new PhrasalVerbWithSuffix("a", "n", "c");
        System.out.println(p_verb2.getPreposition()+" "+p_verb2.getWholeWord()+" "+p_verb2.getWord());
        Suffix suffix = new PhrasalVerbWithSuffix("a", "n", "c");
        System.out.println(suffix.getSuffix());
        PhrasalVerbWithSuffix p_verb3 = new PhrasalVerbWithSuffix("a", "n", "c");
        System.out.println(p_verb3.getPreposition());
        System.out.println(p_verb3.getWholeWord());
        System.out.println(p_verb3.getWord());
        System.out.println(p_verb3.getSuffix());
    }
}
