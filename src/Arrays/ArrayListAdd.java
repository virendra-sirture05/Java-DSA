package Arrays;

import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list+" "+list.size());
		
		list.add(10);
		System.out.println(list+" "+list.size());
		
		list.add(30);
		System.out.println(list+" "+list.size());
		
		list.add(40);
		System.out.println(list+" "+list.size());
		
		list.add(50);
		System.out.println(list+" "+list.size());
		
		list.remove(1);
		System.out.println(list+" "+list.size());
		
	}

}
