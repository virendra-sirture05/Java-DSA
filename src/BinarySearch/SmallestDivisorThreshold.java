package BinarySearch;

public class SmallestDivisorThreshold {
    public static void main(String[] args) {
        // nums = [1,2,5,9], threshold = 6

        int[] arr = {1,2,5,9};
        int t = 6;

        int mx = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }

        int d = -1;
        int start = 1;
        int end = mx;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(isLess(arr,mid,t)){
                d = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        System.out.println(d);
    }

    static boolean isLess(int[] arr, int mid, int t){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%mid==0) sum += arr[i]/mid;
            else sum += arr[i]/mid + 1;
        }
        if(sum <= t){
            return true;
        }
        return false;
    }
}
