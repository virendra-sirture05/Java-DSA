package Arrays;
import java.util.Arrays;
public class SortZeroesOnesOptimized {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,0,1,1};
        sort(arr);
    }
    static void sort(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
            // if(i>j) break;
            if(i<j && arr[i]==1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
