package Arrays;

import java.util.Arrays;

public class BuiltInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,60,80,40,50};
		for(int elem : arr) {
			System.out.print(elem+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
