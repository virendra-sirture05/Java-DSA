package BasicSorting;

import java.util.Arrays;

public class SwapInDecreasingUsingBubble {

    static void sort(int[] arr){
        int n = arr.length; 
        boolean flag = true;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
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
    public static void main(String[] args) {
        int[] arr = {34,5,54,5,4,4,54,3,34};
        sort(arr);
    }
}
