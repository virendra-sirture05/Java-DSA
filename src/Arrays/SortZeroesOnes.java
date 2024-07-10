package Arrays;
import java.util.Arrays;
public class SortZeroesOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,0,1,1,1};
        sort(arr);
    }

    static void sort(int[] arr){
        int noOfZeroes = 0;


        for(int i = 0; i< arr.length; i++){
            if(arr[i] ==0) noOfZeroes++;
            
        }
        for(int i = 0; i < arr.length; i++){
            if(i<noOfZeroes) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
