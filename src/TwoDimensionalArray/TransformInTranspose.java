package TwoDimensionalArray;
public class TransformInTranspose {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        print(arr);

        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<=r; c++){
                int temp = arr[r][c];
                arr[r][c] = arr[c][r];
                arr[c][r] = temp;
            }
        }
        print(arr);
    }
    static void print(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
