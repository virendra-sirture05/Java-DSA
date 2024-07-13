package BasicSorting;

import java.util.Arrays;

public class BubbleSort {

    // bubble sort optimized
    static void bubble2(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            boolean flag = true;
            for(int j =  0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
        System.out.println(Arrays.toString(arr));
    }

    // bubble sort 1
    static void bubble(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,3};
        // bubble(arr);
        bubble2(arr);
    }
}
