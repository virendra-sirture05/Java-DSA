package Arrays;

import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(arr));
		
//		int[] arr2 = arr;
//		arr2[0] = 1000;
//		System.out.println(arr[0]);
		
//		int[] brr = Arrays.copyOf(arr, arr.length);
//		brr[0] = 1000;
//		System.out.println(arr[0]);
		
		int[] crr = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			crr[i] = arr[i];
		}
		System.out.println(Arrays.toString(crr));
		
		crr[0] = 100000;
		System.out.println(arr[0]);
	}

}
