package TwoDimensionalArray;
public class MaxInTwoD {
    public static void main(String[] args) {
        int[][] arr = {
            {17,27,38},
            {54,56,4},
            {34,457,5}
        };

        greatest(arr);
        smallest(arr);
        
    }
    static void greatest(int[][] arr){
        int max = Integer.MIN_VALUE;

        for(int r = 0; r< arr.length; r++){
            for(int c = 0 ; c< arr[r].length; c++){
                if(max < arr[r][c]){
                    max = arr[r][c];
                }
            }
        }
        System.out.println(max);
    }

    static void smallest(int[][] arr){
        int min = Integer.MAX_VALUE;

        for(int r = 0; r< arr.length; r++){
            for(int c = 0; c< arr[r].length; c++){
                min = Math.min(min, arr[r][c]);
            }
        }
        System.out.println(min);
    }
}
