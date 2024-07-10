package Arrays;

public class Ques1 {
	public static void main(String[] args) {
		int[] arr = {56,45,45,34,34,54,45};
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]<35) {
				System.out.println(i);
			}
		}
	}
}
