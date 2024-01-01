package exam01;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		// list index 위치 원소를 바꾼다
		list.set(0, 100);
		System.out.println(list);
		
		list.set(0, list.get(1));
		
	}

}
