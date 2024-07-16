package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPostion {

    // method : 1
    static int[] serachRange(int[] arr, int target){

        // check if ans exist or not
        int start = 0;
        int end = arr.length - 1;
        int[] ans = {-1,-1};
        boolean flag = false;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                flag = true;
                break;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        if(flag == false){
            return ans;
        }


        // for lowerbound, first postion
        start = 0;
        end = arr.length - 1;
        int lb = arr.length;

        while (start <= end) {
            int mid = start+(end-start)/2;
            if(arr[mid] >= target){
                lb = mid;
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        ans[0] = lb;


        // for upper bound, last position
        start = 0;
        end = arr.length - 1;
        int ub = arr.length;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                ub = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        ans[1] = ub - 1;

        return ans;
    }


    

    // method : 2
    static int[] serachRange1(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int[] ans = new int[2];
        int fp = -1;

        while (start <= end) {
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                if(arr[mid] == arr[mid-1]){
                    end = mid - 1;
                }
                else{
                    fp = mid;
                    break;
                }
            }
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        ans[0] = fp;

        start = 0;
        end = arr.length - 1;
        int lp = -1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                if(arr[mid] == arr[mid+1]){
                    start = mid + 1;
                }
                else{
                    lp = mid;
                    break;
                }
            }
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        ans[1] = lp;
        return ans;
    }

    // method: 3
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

        int[] ans = serachRange(arr, target);
        System.out.println(Arrays.toString(ans));
        int[] ans1 = serachRange(arr, target);
        System.out.println(Arrays.toString(ans1));
        int[] ans2 = serachRange(arr, target);
        System.out.println(Arrays.toString(ans2));

    }
}
