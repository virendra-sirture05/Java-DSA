package Arrays;

public class FindDublet {

	public static void main(String[] args) {
		int[] arr = {3,4,5,7,4};
		int target = 9;
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
