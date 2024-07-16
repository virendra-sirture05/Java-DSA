package BinarySearch;

import java.util.Arrays;

public class FirstAnsLastPositin2 {
    static int[] serachRange2(int[] arr, int target){
        int ans[] = {-1,-1};
        int firstOcc = search(arr, target, true);
        int lastOcc = search(arr, target, false);

        ans[0] = firstOcc;
        ans[1] = lastOcc;
        return ans;
    }
    static int search(int[] arr, int target, boolean isFirst){
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,20,20,20,20,40,50,60};
        //    1, 4

        int target = 20;
        int[] ans2 = serachRange2(arr, target);
        System.out.println(Arrays.toString(ans2));

    }
    
}
