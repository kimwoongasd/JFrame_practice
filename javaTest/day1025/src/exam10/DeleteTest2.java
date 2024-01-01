package exam10;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteTest2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("성실");
		list.add("돈");
		list.add("집");
		list.add("욕심");
		list.add("건강");
		list.add("가족");
		
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 목록을 입력하시오");
		String name = sc.next();
		
		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			String item = list.get(i);
			if (item.equals(name)) {
				flag = false;
				System.out.println(name + "항목을 삭제했습니다"); 
			}
		}
		
		if (true) System.out.println("삭제할 항목이 없습니다");
		
//		list.remove(name);
		System.out.println(list);
		
	}

}
