package day0926;

import java.util.Scanner;

public class Ewam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, place1000, place100, place10, place1;
		System.out.print("정수를 입력하시오 ");
		num = sc.nextInt();
		
		place1000 = num / 1000;
		num %= 1000;
		place100 = num / 100;
		num %= 100;
		place10 = num / 10;
		num %= 10;
		place1 = num;
		
		System.out.println("천의 자리 : " + place1000);
		
		System.out.println("백의 자리 : " + place100);
		
		System.out.println("십의 자리 : " + place10);
		
		System.out.println("일의 자리 : " + place1);
		
	}

}
