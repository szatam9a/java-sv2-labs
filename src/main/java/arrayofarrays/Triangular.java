package arrayofarrays;

public class Triangular {
   public int[][] triangularMatrix(int size)
    {
         int[][] triangular = new int[size][];

        for (int i = 0; i<size  ; i++)
        {
            for (int j = 0; j<=i ; j++)
            {
                triangular[i] = new int [i+1];
                System.out.print(i+" ");
                triangular[i][j]= i;
            }
            System.out.println();
        }
    return triangular;
    }

    public static void main(String[] args) {
        Triangular tri = new Triangular();
        tri.triangularMatrix(6);
    }
}
