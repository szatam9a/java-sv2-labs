package chars;

public class Words {
//    public String pushWord(String word){
//        char[] text = word.toCharArray();
//        for (int i = 0; i < text.length ; i++) {
//             text[i]= (char) (text[i]+1);
//        }
//        word =new String(text);
//    return word;
//    }
    public String pushWord(String word){
        String s = "";
        for (char c: word.toCharArray()) {
            s= s + (char)(c+1);
        }
    return s;}

    public static void main(String[] args) {
        Words word = new Words();
        System.out.println(word.pushWord("alma"));

    }
}
