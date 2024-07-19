package BinarySearch;

public class ShipWithinDays {
    static boolean isPossible(int[] arr, int mid, int d){
        int load = 0;
        int days = 1;
        for(int i = 0; i<arr.length; i++){
            if(load + arr[i] <= mid){
                load += arr[i];
            }
            else{
                load = arr[i];
                days++;
            }
        }
        if(days <= d){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int sum = 0;
        int max = 0;

        for(int i = 0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        int start = max;
        int end = sum;
        int ans = 0;
        while (start <= end) {
            int mid = start +(end -start)/2;
            if(isPossible(arr, mid, days)){
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        System.out.println(ans);
    }
}
