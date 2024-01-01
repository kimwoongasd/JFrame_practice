package exam10;

import java.util.ArrayList;

public class DeleteTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("성실");
		list.add("돈");
		list.add("집");
		list.add("욕심");
		list.add("건강");
		list.add("가족");
		
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
	}

}
