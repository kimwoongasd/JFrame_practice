package exam02;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBinarySearch2 {

	public static void main(String[] args) {
		// 등록된 회원의 이름을 5명이상 배열에 저장
		String[] name = {"유재석", "강호동", "이경규", "탁재훈", "이수근"};
		
		// 이름을 입력받아 등록된 회원인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 회원 이름을 입력하시오");
		String str = sc.next();
		
		Arrays.sort(name);
		if (Arrays.binarySearch(name, str) >= 0) {
			System.out.println(str + "회원이 있씁니다");
		} else {
			System.out.println(str + "은 존재하지 않습니ㅏ");
		}

	}

}
