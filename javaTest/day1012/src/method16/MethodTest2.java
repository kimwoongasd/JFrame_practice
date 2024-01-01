package method16;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		String []r = {"천귀","천액","천권","천파","천인","천문","천복","천고","천역","천간","천수","천명"};
		Scanner sc = new Scanner(System.in);		
		String name,result="";
		int year, month, date, hour, check;
		System.out.println("이름을 입력==>");
		name = sc.next();
		System.out.println("[쥐:0, 소:1, 범:2, 토끼:3, 용:4, 뱀:5, 말:6, 양:7, 원숭이:8, 닭:9, 개:10, 돼지:11]");
		System.out.println("띠를 입력==>");
		year = sc.nextInt();
		System.out.println("생월을 입력==>");
		month = sc.nextInt();
		System.out.println("생일을 입력==>");
		date = sc.nextInt();
		System.out.println("[자:0, 축:1, 인:2, 묘:3, 진:4, 사:5, 오:6, 미:7, 신:8, 유:9, 술:10, 해:11]");
		System.out.println("생시를 입력==>");
		hour = sc.nextInt();
		
		check = year;
		result += r[check]+" ";
		
		check += month - 1;
		check %=12;
		result += r[check] + " ";
		
		check += date - 1;
		check %=12;
		result += r[check]+ " ";
		
		check += hour;
		check %=12;
		result += r[check]+ " ";
		
		System.out.printf("%s님의 사주팔자 풀이는 %s입니다.", name, result);
		
	}
}
