package BasicSorting;

import java.util.Arrays;

public class SwapUsingSelection {

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = arr.length-1; i>0; i--){
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for(int j = i; j>=0; j--){
                if(arr[j] > max){
                    max = arr[j];
                    maxdx = j;
                }
            }

            // swap
            swap(arr, i, maxdx);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
