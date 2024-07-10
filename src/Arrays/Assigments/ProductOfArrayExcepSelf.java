package Arrays.Assigments;
import java.util.*;
public class ProductOfArrayExcepSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        product(nums);
        
    }
    static void product(int[] arr){
         int[] ans = new int[arr.length];
         

         for(int i = 0; i<arr.length; i++){
            int pro = 1;
            for(int j = 0; j<arr.length; j++){
                if(i==j) continue;
                pro *= arr[j];
            }
            ans[i] = pro;
         }
         System.out.println(Arrays.toString(ans));
        
    }
}
