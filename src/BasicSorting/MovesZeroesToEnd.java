package BasicSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MovesZeroesToEnd {

    // By using bubble sort algorithm
    static void sort1(int[] arr){
        int n = arr.length; 
        int noOfZeroes = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0) noOfZeroes++;
        }

        for(int i = 0; i<=noOfZeroes; i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // By creating new arraylist
    static void sort(int[] arr){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int noOfZeroes = 0;
        for(int ele : arr){
            if(ele != 0){
                list.add(ele);
            }
            else noOfZeroes++;
        }
        for(int i = 0; i<= noOfZeroes; i++){
            list.add(0);
        }

        for(int i = 0; i< arr.length; i++){
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,4,3,0,2};
        // sort(arr);
        sort1(arr);
    }
}
