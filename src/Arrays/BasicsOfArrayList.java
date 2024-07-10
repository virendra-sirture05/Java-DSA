package Arrays;

import java.util.ArrayList;

public class BasicsOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(6);
		
		arr.add(0,10); // arr[0] = 10;
		arr.add(1,20);
		arr.add(2,40);
		arr.add(3,50);    // intialize
		arr.add(4,60);
		arr.add(5,70);
		
		System.out.println(arr);
		
		System.out.println(arr.get(0));  // get element
		
		arr.set(2, 300);    // modify/ update
		System.out.println(arr);;
		
		arr.add(90);    // pushes 90 to the end of the list
		System.out.println(arr);
		
	}

}
