package TwoDimensionalArray;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {4,5,6},
            
        };
        int[][] b = {
            {1,2},
            {3,4},
            {5,6}
        };

        int[][] c = new int[a.length][b[0].length];

        for(int i = 0; i<c.length; i++){
            for(int j = 0; j<c[0].length; j++){

                // c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j] ......
                for(int k = 0; k<b.length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}
