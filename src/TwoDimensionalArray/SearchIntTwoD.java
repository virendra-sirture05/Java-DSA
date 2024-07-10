package TwoDimensionalArray;

public class SearchIntTwoD {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,5,535,5},
            {53,343,23,34}
        };
        int target = 78;
        System.out.println(matrix(arr, target));
    }
    static boolean matrix(int[][] arr,int target){
        int m = arr.length-1;
        int n = arr[0].length-1;
        int i = 0;
        int j = arr[0].length-1;

        boolean flag = false;
        while(i <= m || j >=0){
            if(arr[i][j]==target) return true;
            else if(arr[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
