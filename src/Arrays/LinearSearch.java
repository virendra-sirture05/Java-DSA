package Arrays;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target");
		int x = sc.nextInt();
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		boolean flag = false;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == x) {
				flag = true;
				break;
			}
		}
		if(flag == true) System.out.println("found");
		else System.out.println("not found");
		
	}

}
