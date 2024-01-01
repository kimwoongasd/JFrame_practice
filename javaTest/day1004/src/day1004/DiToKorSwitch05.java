package day1004;

import java.util.Scanner;

public class DiToKorSwitch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("0~9 사이의 수를 입력하시오");
		n = sc.nextInt();
		
		
		
		if (n < 0 || n > 9) {
			System.out.println("입력값 오류");
			return;
		}
		
		String res = "";
		switch(n) {
			case 0:
			case 1:
			case 2:res="이";break;
			case 3:
			case 4:
			case 5:res="오";break;
			case 6:
			case 7:
			case 8:
			case 9:res="구";break;
		}
		
		System.out.println(res);
		
	}

}
