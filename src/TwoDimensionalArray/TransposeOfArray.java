package TwoDimensionalArray;

public class TransposeOfArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2},
            {3,4},
            {5,6}
        };

        // for(int j = 0; j<arr[0].length; j++){
        //     for(int i = 0; i<arr.length; i++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int m = arr.length;
        int n = arr[0].length;
        int[][] transpose = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                transpose[i][j] = arr[j][i];
                System.out.println(transpose[i][j]);
            }
        }
    }
}
