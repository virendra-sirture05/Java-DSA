package Arrays;
import java.util.*;
public class NextGreatestElem {
    public static void main(String[] args) {
        int[] arr = {12,24,34,45,3,23,3,2,1,22};
        greatest(arr);
        greatest2(arr);
    }

    // method 1: Brute force approach
    static void greatest(int[] arr){
        int[] ans = new int[arr.length];
        ans[arr.length-1] = -1;
        for(int i = 0; i<arr.length-1; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i+1; j<arr.length; j++){
                
                max = Math.max(max, arr[j]);
            }
            ans[i] = max;
            
        }
        System.out.println(Arrays.toString(ans));
    }

    // method 2: Optimized

    static void greatest2(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

        int nge = arr[n-1];
        for(int i = n-2; i>=0; i--){
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
