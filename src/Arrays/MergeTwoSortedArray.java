package Arrays;
import java.util.Arrays;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] brr = {11,22,33,44};
        // merging(arr,brr);
        merging2(arr, brr);
    }

    // method 1
    static void merging(int[] arr, int[] brr){
        int i = 0, j = 0, k =0;
        int[] crr = new int[arr.length + brr.length];
        while (i < arr.length && j < arr.length) {
            if(arr[i] < brr[j]){
                crr[k] = arr[i];
                i++; k++;
            }
            else{
                crr[k] = brr[j];
                j++; k++;
            }
        }

        if(i==arr.length){
            while (j<brr.length) {
                crr[k] = brr[j];
                j++; k++;
            }
        }
        if(j == brr.length){
            while (i<arr.length) {
                crr[k] = arr[i];
                i++; k++;
            }
        }

        System.out.println(Arrays.toString(crr));
    }

    // method 2

    static void merging2(int[] arr, int[] brr){
        int i = arr.length-1;
        int j = brr.length - 1;
        int[] crr = new int[arr.length + brr.length];
        int k = crr.length - 1;

        while(i >= 0 && j >= 0){
            if(arr[i] > brr[j]){
                crr[k] = arr[i];
                i--; k--;
            }
            else{
                crr[k] = brr[j];
                j--; k--;
            }
        }

        if(i < 0){
            while (j >= 0){
                crr[k] = brr[j];
                j--; k--;
            }
        }
        if(j < 0){
            while (i >= 0) {
                crr[k] = arr[i];
                i--; k--;
            }
        }

        System.out.println(Arrays.toString(crr));
    }
}
