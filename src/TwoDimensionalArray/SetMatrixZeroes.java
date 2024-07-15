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

    // method 2: optimized
    static int[][] method2(int[][] arr){
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

    // method 3: besy solution
    static int[][] method3(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        boolean zeroRow = false;
        boolean zeroCol = false;

        // check the 0th col
        for(int i = 0; i<m; i++){
            if(arr[i][0]==0){
                zeroCol = false;
                break;
            }
        }

        // check the oth row
        for(int j = 0; j<n; j++){
            if(arr[0][j]==0){
                zeroRow = true;
                break;
            }
        }

        // traverse in the matrix without oth row and 0th col
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // traverse in 0th row
        for(int j = 1; j<n; j++){
            if(arr[0][j]==0){
                for(int i = 1; i<m; i++){
                    arr[i][j] = 0;
                }
            }
        }

        //traverse in oth col
        for(int i = 1; i<m; i++){
            if(arr[i][0] == 0){
                for(int j = 1; j<n; j++){
                    arr[i][j] = 0;
                }
            }
        }

        if(zeroRow==true){
            for(int j = 0; j<n; j++){
                arr[0][j] = 0;
            }
        }
        if(zeroCol == true){
            for(int i = 0; i<m;i++){
                arr[i][0] = 0;
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

        // method 1: brute force approach

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
        // print(arr);


        // method2(arr);
        print(arr);
        method3(arr);
        print(arr);
    }
}
