package BinarySearch;

public class MinizedMaximumProduct {
    static boolean isPossible(int[] arr, int minQ, int n){
        int stores = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%minQ==0) stores += arr[i]/minQ;
            else stores += arr[i]/minQ + 1;
        }
        if(stores <=n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {15,10,10};
        int n = 7;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            max = Math.max(arr[i], max);
        }

        int start = 1;
        int end = max;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end -start)/2;
            if(isPossible(arr, mid, n)){
                ans = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        System.out.println(ans);
    }
}
