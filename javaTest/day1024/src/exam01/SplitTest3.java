package exam01;

import java.util.Scanner;

/*
 * 사용자한테 입력받아 단어 수를 출력
 * */

public class SplitTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data;
		int cnt = 0;
		
		System.out.println("데이터를 입력하시오");
		// 공백 포함
		data = sc.nextLine();
		
		String[] arr = data.split(" ");
		
		cnt = arr.length;
		
		System.out.println("단어의 수 : " + cnt);
	}

}
