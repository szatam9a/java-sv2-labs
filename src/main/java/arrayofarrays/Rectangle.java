package arrayofarrays;

public class Rectangle {
    public int[][] rectangularMatrix(int size){
        int[][] square = new int[size][size];

        for (int i = 0; i<size  ; i++)
        {
            int j;
            for (j = 0; j<size ; j++)
            {

                System.out.print(i+" ");
                square[i][j]= i;
            }
            System.out.println();
        }
    return square;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.rectangularMatrix(5);
    }
}
