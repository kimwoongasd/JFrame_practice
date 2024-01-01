package day1006;

import java.util.Scanner;

public class Programming2_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String op, shape = "";
		double res = 0;
		
		System.out.println("도형의 종류를 선택하시오 [R, T, C]");
		op = sc.next().toUpperCase();
		
		if (!op.equals("R") && !op.equals("T") && !op.equals("C")) {
			System.out.println("잘못된 입력");
			return;
		}
		
		
		if (op.equals("R")) {
			double row, col;
			shape = "사각형";
			System.out.println("가로를 입력하시오");
			row = sc.nextDouble();
			System.out.println("세로를 입력하시오");
			col = sc.nextDouble();
			
			res = row * col;
			
		} else if (op.equals("T")) {
			double row, height;
			shape = "삼각형";
			System.out.println("밑변을 입력하시오");
			row = sc.nextDouble();
			System.out.println("높이를 입력하시오");
			height = sc.nextDouble();
			
			res = row * height / 2;
			
		} else if (op.equals("C")) {
			double r;
			shape = "원";
			System.out.println("반지름을 입력하시오");
			r = sc.nextDouble();
			
			res = r * r * Math.PI;
		}
		
		System.out.printf("%s의 넓이는 %.2f 입니다", shape, res);
	}

}
