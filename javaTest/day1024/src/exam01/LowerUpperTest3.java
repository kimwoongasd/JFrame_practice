package exam01;

import java.util.Scanner;

public class LowerUpperTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String re;
		
		System.out.println("당신은 학생입니까?(yes/no)");
		
		re = sc.next().toLowerCase();
		
		if (re.equals("yes")) {
			System.out.println("학생입니다");
		} else {
			System.out.println("학생이 아닙니다");
		}
	}
}
