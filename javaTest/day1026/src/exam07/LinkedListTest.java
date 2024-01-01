package exam07;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("사과");
		list.add("배");
		list.add("귤");
		list.add("감");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
	}

}
