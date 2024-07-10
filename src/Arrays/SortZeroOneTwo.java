package Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,2,1,2,0,1,2};
        sort(arr);
    }

    // method 1 :  two pass
    static void sort(int[] arr){
        int noOfZeroes = 0;
        int noOfOnes = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0) noOfZeroes++;
            if(arr[i] == 1) noOfOnes++;
        }
        for(int i = 0; i<arr.length; i++){
            if(i<noOfZeroes) arr[i] = 0;
            else if(i<noOfZeroes+noOfOnes) arr[i] = 1;
            else arr[i] = 2;
        }
        for(int elem : arr){
            System.out.print(elem+" ");
        }
    }
}
