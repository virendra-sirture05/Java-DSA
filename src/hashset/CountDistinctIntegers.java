package hashset;

import java.util.HashSet;

public class CountDistinctIntegers {
    static int countDigit(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
            set.add(reverse(arr[i]));
        }
        return set.size();
    }
    static int reverse(int n){
        int rev = 0;
        while (n>0) {
            rev = rev * 10 + n%10;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] arr = {1,13,10,12,31};
        System.out.println(countDigit(arr));
    }
}
