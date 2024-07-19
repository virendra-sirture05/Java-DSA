package BinarySearch;

public class KthMissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            int missed = arr[mid] - (mid+1);
            if(missed < k) start = mid + 1;
            else end = mid - 1;
        }

        System.out.println(arr[end]+k-(arr[end]-(end+1)));
    }
}
