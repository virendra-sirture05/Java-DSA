package TwoDimensionalArray;

public class SumOfTwoD {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        sum(arr);
        product(arr);
    }

    static void sum(int[][] arr){
        int sum = 0;
        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                sum += arr[r][c];
            }
        }
        System.out.println(sum);
    }

    static void product(int[][] arr){
        int product = 1;
        for(int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                product *= arr[r][c];
            }
        }
        System.out.println(product);
    }
}
