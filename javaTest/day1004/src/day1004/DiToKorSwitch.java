package day1004;

import java.util.Scanner;

public class DiToKorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("0~9 사이의 수를 입력하시오");
		n = sc.nextInt();
		
		switch(n) {
			case 0:
				System.out.println("영");
				break;
			case 1:
				System.out.println("일");
				break;
			case 2:
				System.out.println("이");
				break;
			case 3:
				System.out.println("삼");
				break;
			case 4:
				System.out.println("사");
				break;
			case 5:
				System.out.println("오");
				break;
			case 6:
				System.out.println("육");
				break;
			case 7:
				System.out.println("칠");
				break;
			case 8:
				System.out.println("팔");
				break;
			case 9:
				System.out.println("구");
				break;
		}
	}

}
