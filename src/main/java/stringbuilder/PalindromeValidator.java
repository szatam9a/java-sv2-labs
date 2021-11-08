package stringbuilder;

public class PalindromeValidator {
    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append(word);
        sb2.append(sb).reverse();
        return (sb.toString().equalsIgnoreCase(sb2.toString()));

             }

    public static void main(String[] args) {
        PalindromeValidator pv = new PalindromeValidator();
        System.out.println(pv.isPalindrome("Tedd a tévé tetejére a távírányítót!"));
    }
}
