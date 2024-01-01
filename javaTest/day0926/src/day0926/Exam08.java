package day0926;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double height, inch;
		int feet;
		
		System.out.println("키를 입력하시오");
		height = sc.nextDouble();
		inch = height / 2.54;
		feet = (int)inch / 12;
		
		inch -= feet * 12;
		
		System.out.printf((int)height + "cm는 "
		+ feet + "피트 %.5f 인치입니다.", inch);
	}

}
