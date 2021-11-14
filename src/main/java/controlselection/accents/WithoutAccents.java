package controlselection.accents;

import java.util.Arrays;
import java.util.List;

public class WithoutAccents {
    public char removeAccent(char subject){
        String hungarianChars = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";
        String englishChars = "aeiooouuuAEIOOOUUU";
        int index =hungarianChars.indexOf(subject);
        if (index>0){
            subject= englishChars.charAt(index);

        }
    return subject;}

}
