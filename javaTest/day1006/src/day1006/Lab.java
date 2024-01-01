package day1006;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s;
		String res = "";
		System.out.println("점수를 입력하시오");
		s = sc.nextInt();
		
		res = (s >= 60) ? "합격" : "불합격";
		System.out.println(res);
		
	}

}
