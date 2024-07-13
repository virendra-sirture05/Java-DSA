package BasicSorting;

import java.util.Arrays;

public class BuiltInSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
