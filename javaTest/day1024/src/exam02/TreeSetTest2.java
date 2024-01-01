package exam02;

import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet data = new TreeSet();
		
		boolean f = data.add("딸기");
		System.out.println(f);
		f = data.add("망고");
		System.out.println(f);
		f = data.add("귤");
		System.out.println(f);
		f = data.add("사과");
		System.out.println(f);
		f = data.add("귤");
		System.out.println(f);
		
		System.out.println(data);
		System.out.println(data.size());
		
	}

}
