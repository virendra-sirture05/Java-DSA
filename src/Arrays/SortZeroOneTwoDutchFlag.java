package Arrays;

public class SortZeroOneTwoDutchFlag {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,2,1,1,0,2};
        sort(arr);
    }
    static void sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int elem : arr){
            System.out.print(elem+" ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
