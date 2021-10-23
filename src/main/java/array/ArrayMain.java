package array;

public class ArrayMain {
    public static void main(String[] args) {
         String[] nap = new String[10];
         String[] napok = {
            "Hétfő", "Kedd", " Szerda", "Csötörtök", "Péntel", "Szombat", "Vasárnap"};
        System.out.println("3. elem a tömbben: " +napok[3]);
        System.out.println("napok tömb hossza: "+napok.length);

        int[] sqr = new int [5];
        sqr[0]=1;
        for (int i = 1;i<sqr.length;i++)
        {
            sqr[i]=sqr[i-1]*2;
        }
        for (int i =0;i<sqr.length;i++)
            {
                System.out.print(sqr[i] +" ");
            }
        System.out.println();

        boolean[] secret = new boolean[6];
        secret[0]= false;
        for (int i =1;i<secret.length;i++)
        {
            secret[i]= !secret[i-1];
        }
        for (int i=0;i< secret.length;i++)
        {
            System.out.print(secret[i]+" ");
        }
        System.out.println();

        for (int sqrs:sqr
             ) {
            System.out.println(sqrs);
        }


    }
}