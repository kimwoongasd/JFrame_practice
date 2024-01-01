package exam03;

import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		String msg;
		
		System.out.println("문장을 입력하시오");
		msg = sc.nextLine();
		
		int i = 0, j = msg.length();
		
		while (true) {
			if (i >= j) break;
			
			j = msg.indexOf(" ");
			
			String tem = msg.substring(i, j);
			
			System.out.println(dict.get(tem));
			if (dict.get(tem) == null) {
				dict.put(tem, 1);
			} else {
				dict.put(tem, dict.get(tem) + 1);
			}

			i = j;
			if (msg.indexOf(" ") == -1) j = msg.length();
			else j = msg.indexOf(" ");
		}
		
		System.out.println(dict);
	}
}
