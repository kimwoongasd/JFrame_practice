package exam15;

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
		
		int n;
		while (true) {
			System.out.println("1. 검색  2. 추가  3. 삭제 0. 종료");
			n = sc.nextInt();
			
			if (n == 0) break;
			
			String eng;
			if (n == 1) {
				System.out.println("찾을 단어를 입력하시오");
				eng = sc.next();
				
				String kor = dict.get(eng);
				if (kor == null) {
					System.out.println("사전에 없는 단어입나다");
				} else {
					System.out.println(eng + " == " + kor);
				}
			} else if (n == 2) {
				String kor;
				System.out.println("추가할 영어단어를 입력하시오");
				eng = sc.next();
				
				System.out.println("뜻을 입력하시오");
				kor = sc.next();
				
				dict.put(eng, kor);
				System.out.println(eng + " : " + kor + "를 추가 했습니다");
			} else if (n == 3) {
				System.out.println("삭제할 단어를 입력하시오");
				eng = sc.next();
				
				if (dict.get(eng) != null) {
					dict.remove(eng);
					System.out.println(eng + "를 삭제 했습니다");
				} else {
					System.out.println("해당 단어는 없습니다");
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}
