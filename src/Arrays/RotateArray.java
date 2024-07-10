package Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		int k = 5;
		int n = arr.length;
		int[] brr = new int[arr.length];
		
		
		for(int i = n-k,j=0; i<n; i++,j++) {
			brr[j] = arr[i];
		}
        for(int i = 0,j=k; i<n-k; i++,j++){
            brr[j] = arr[i];
        }
		System.out.println(Arrays.toString(brr));
	}

}
