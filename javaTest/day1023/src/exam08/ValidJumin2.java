package exam08;

import java.util.Scanner;

// 주민 맞는지 체크
public class ValidJumin2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.println("주민번호 입력==>");
		jumin = sc.next();
		//800101-1234567
		
		// 주민번호 마지막번호 구하기
		int check = Integer.parseInt(jumin.substring(13, 14));
		// 반복문 돌면서 곱할 숫자
		int []arr = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		int sum = 0;
		
		// 반복문을 통해 총합 구하기
		for(int i=0; i<jumin.length()-1; i++) {
			// "-" 은 제외하고 숫자 곱하기
			if(i != 6) {
				// substring를 통해 원하는 자리를 잘라서 숫자로 사용
				int n = Integer.parseInt(jumin.substring(i, i+1));
				// 총합 구하기
				sum += n * arr[i];
			}
		}
		
		// 마지막 번호와 비교할 숫자 구하기
		sum = sum % 11;
		sum = 11 - sum;
		
		// 10이 넘으면 10일 떄 0 11일 때 1
		if(sum ==  10) {
			sum = 0;
		}
		if(sum == 11) {
			sum = 1;
		}
		
		// 마지막 주민번호와 비교
		if(sum == check) {
			System.out.println("올바른 주민번호 입니다.");
		}
		else {
			System.out.println("올바른 주민번호가 아닙니다.");
		}
	}

}
