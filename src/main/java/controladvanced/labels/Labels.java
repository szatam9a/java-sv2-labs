package controladvanced.labels;

import java.util.Arrays;

public class Labels {

    public int[][] getTableOfNumbers(int number) {
        int[][] table = new int[number][number];
        table[0][0] = 1;
        OUTER:for (int i = 0; i < number; i++) {
            INTER: for (int j = 0; j < number; j++) {
                table[i][j] = (i + 1) + (j + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        Labels labes = new Labels();
        System.out.println(Arrays.deepToString(labes.getTableOfNumbers(6)));

    }
}
