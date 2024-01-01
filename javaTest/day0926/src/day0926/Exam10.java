package day0926;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start, end, use, res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출발한 지점의 주행 거리계: ");
		start = sc.nextInt();
		System.out.println("도착한 지점의 주행 거리계: ");
		end = sc.nextInt();
		System.out.println("사용한 연료: ");
		use = sc.nextInt();
		
		res = (end - start) / use;
		System.out.printf("연비는 %d km/l 입니다.", res);
		
	}

}
