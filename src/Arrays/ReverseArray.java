package Arrays;
// Two pointers
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
	}
	
	static void reverse(int[] arr) {
		int start = 0; 
		int end = arr.length-1;
		
//		int i = 1, j = 5; part of array
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
