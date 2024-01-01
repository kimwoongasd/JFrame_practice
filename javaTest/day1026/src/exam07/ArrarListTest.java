package exam07;

import java.util.ArrayList;

public class ArrarListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("배");
		list.add("귤");
		list.add("감");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}

}
