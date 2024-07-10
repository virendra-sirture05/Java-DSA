package Arrays;

public class MaxValue {
	public static void main(String[] args) {
		int[] arr = {3,43,435,5445,454,45};
		int ans = max(arr);
		System.out.println(ans);
//		System.out.println(min(arr));
	}
	static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMx = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>secondMx && arr[i] !=max) {
				secondMx = arr[i];
			}
		}
		return secondMx;
	}
	static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++) {
//			if(arr[i]<min) {
//				min = arr[i];
//			}
			min = Math.min(min, arr[i]);
		}
		return min;
	}
}
