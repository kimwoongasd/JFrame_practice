package exam13;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// k, v가 String인 map을 생성
		HashMap<String, String> dict = new HashMap<String, String>();
		
		// 생성된 map에 key를 영단어, value를 설명으로 5개 추가
		dict.put("haze", "아지랑이");
		dict.put("sunset", "일출");
		dict.put("spring", "봄");
		dict.put("stella", "별");
		dict.put("snowflake", "눈송이");
		
		String str;
		System.out.println("찾을 단어를 입력하시오");
		str = sc.next();
		
		String res = dict.get(str);
		if (res == null) {
			System.out.println("사전에 없는 단어입나다");
		} else {
			System.out.println(res);
		}

	}
}
