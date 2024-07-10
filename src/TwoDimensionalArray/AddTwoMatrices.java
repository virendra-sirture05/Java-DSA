package TwoDimensionalArray;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30},
            {40,50,60},
            {10,20,30}
        };

        int[][] brr = {
            {10,20,30,},
            {40,50,60},
            {10,20,30}
        };
        // add(arr, brr);
        add2(arr, brr);
    }
    static void add(int[][] arr, int[][] brr){
        int[][] crr = new int[arr.length][arr[0].length];
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                crr[r][c] = arr[r][c] + brr[r][c];
            }
        }

        for(int[] elem : crr){
            for(int x : elem){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    // Without creating an extra array

    static void add2(int[][] arr, int[][] brr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = arr[i][j] + brr[i][j];
            }
        }
        for(int[] elem : arr){
            for(int x : elem){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
