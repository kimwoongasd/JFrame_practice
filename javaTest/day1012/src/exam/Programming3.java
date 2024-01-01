package exam;

import java.util.Scanner;

public class Programming3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data;
		Scanner sc = new Scanner(System.in);
		int n, total = 0, avg, max, min;
		
		System.out.println("n을 입력하시오");
		n = sc.nextInt();
		data = new int[n];
		
		// 반복문을 이용하여 n개 만큼 배열에 데이터 입력
		for (int i = 0; i < data.length; i++) {
			System.out.println("데이터 입력");
			data[i] = sc.nextInt();
			total += data[i];
		}
		
		avg = total / n;
		max = data[0];
		min = data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
			
			if (min > data[i]) {
				min = data[i];
;			}
		}
		
		System.out.print("배열의 요소 : ");
		for (int x : data) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
 	}

}
