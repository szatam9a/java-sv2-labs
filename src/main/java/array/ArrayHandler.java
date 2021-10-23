package array;

public class ArrayHandler {
     void addIndexToNumber(int[] source)
    {
        for (int i = 0;i< source.length;i++)
            source[i]+=i;
    }
     void concatenateIndexToWord(String[] source){
        for (int i =0; i< source.length;i++
        ) {
            Integer j = i;
            source[i]= (j)+source[i];

        }
    }
    void concatenateIndexToWordForEach(String[] source){
        Integer counter=0;
        for (String elem:source
        ) {
            source[counter]=counter+elem;
            counter++;
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int [] {1,2,3,64,5};
        String[] string = new String[]{"Kutya","Cica","Mérési Hiba","Ikea","Praktiker","Baumax","És kika"};
        ArrayHandler ah = new ArrayHandler();

        ah.addIndexToNumber(numeros);
        for (int numb:numeros)
        {
            System.out.println(numb);
        }

        ah.concatenateIndexToWord(string);
        for (String text:string
             ) {
            System.out.print(text+",");
        }

        System.out.println();
        ah.concatenateIndexToWordForEach(string);
        for (String text:string
        ) {
            System.out.print(text+",");
        }
    }
}
