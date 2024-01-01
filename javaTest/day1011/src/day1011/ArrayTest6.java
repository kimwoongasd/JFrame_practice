package day1011;

import java.util.Scanner;

// 4지 선다형 문항의 답안 10개를 입력받아
// 답이 옳은지 판별하여 맞으면 '0' 틀리면 'x'로 출력하고
// 정답수와 틀린답수를 각각 구하여 출력

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] question = {2, 4, 1, 2, 3, 1, 2, 1, 4, 3};
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		int[] cur = new int[10];
		
		for (int i = 0; i < cur.length; i++) {
			System.out.println((i + 1) + "번 정답을 입력하시오");
			cur[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번\t");
		}
		
		System.out.println();
		
		for (int i = 0; i < cur.length; i++) {
			if (cur[i] == question[i]) {
				ans += 1;
				System.out.print("0\t");
			} else {
				System.out.print("X\t");
			}
		}
		System.out.println();
		System.out.println("정답 : " + ans);
		System.out.println("오답 : " + (10 - ans));
		
	}

}
