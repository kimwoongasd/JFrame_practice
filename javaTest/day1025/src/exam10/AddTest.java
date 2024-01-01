package exam10;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사랑");
		list.add("우정");
		list.add("권력");
		System.out.println(list);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하시오");
		String data = sc.next();
		list.add(data);
		
		System.out.println(list);
	}

}
