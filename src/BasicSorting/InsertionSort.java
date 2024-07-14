package BasicSorting;

import java.util.Arrays;

public class InsertionSort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr){
        int n = arr.length; 
        // for(int i = 1; i<n; i++){
        //     for(int j = i; j>0; j--){
        //         if(arr[j] < arr[j-1])
        //         swap(arr, j, j-1);
        //         else break;
        //     }
        // }

        for(int i = 1; i<n; i++){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
