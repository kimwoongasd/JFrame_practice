package day1011;

import java.util.Scanner;

public class CountErrer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 26개의 정수를 저장할 수 있는 배열 count을 선언하고 생성
		int[] count = new int[26];
		
		System.out.println("문자열을 입력하시오: ");
		String buffer = sc.nextLine(); // nextLine : 빈칸까지 입력가능
		
		// 각 문자가 등장하는 회수를 계산한다
		for (int i = 0; i < buffer.length(); i++) {
			char ch = buffer.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch + 32);
			}
			
			if (ch >= 'a' && ch <= 'z') {
				count[ch - 'a']++;
			}
		}
		
		// 배열에 저장된 횟수를 출력하는 반복 루프
		for (int i = 0; i < count.length; i++) {
			System.out.printf("%c 의 개수 : %d\n", (char)(i + 97), count[i]);
		}
	}

}
