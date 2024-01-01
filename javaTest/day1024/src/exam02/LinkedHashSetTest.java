package exam02;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet data = new LinkedHashSet();
		
		data.add("딸기");
		data.add("메론");
		data.add("수박");
		data.add("망고");
		data.add("귤");
		data.add("망고");
		
		System.out.println(data);
	}

}
