package BinarySearch;
public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int x = 35;
        int lb = arr.length;

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end -start)/2;

            if(arr[mid] >= x){
                lb = Math.min(mid, lb);
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        
        System.out.println(lb);
    }
}
