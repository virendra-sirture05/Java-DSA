package TwoDimensionalArray;
import java.util.*;
public class SetMatrixZeroes {
    static void print(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // optimized
    static int[][] method1(int[][] arr){
        int m = arr.length;
        int n = arr[0].length; 
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i<m; i++){
           if(row[i]==true){
            for(int j = 0;j<n; j++){
                arr[i][j] = 0;
            }
           }
        }
        for(int j = 0; j<n; j++){
            if(col[j]==true){
                for(int i = 0; i<m; i++){
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };

        // brute force approach

        // int m = arr.length;
        // int n = arr[0].length;

        // int[][] helper = new int[m][n];
        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j<n; j++){
        //         helper[i][j] = arr[i][j];
        //     }
        // }
        // print(arr);
        // print(helper);

        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j<n; j++){
        //         if(helper[i][j]==0){
        //             for(int r = 0; r<m; r++){
        //                 arr[r][j] = 0;
        //             }
        //             for(int c = 0; c<n; c++){
        //                 arr[i][c] = 0;
        //             }
        //         }
        //     }
        // }
        print(arr);


        method1(arr);
        print(arr);
    }
}
