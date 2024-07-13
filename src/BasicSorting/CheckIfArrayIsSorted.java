package BasicSorting;

public class CheckIfArrayIsSorted {
    static boolean isSorted(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5};
        boolean flag = isSorted(arr);
        if(flag == true) System.out.println("Array is sorted");
        else System.out.println("Arrays is unsorted");
    }
}
