package day1005;

// 배열을 이용하여 다음 숫자를 저장하고 평균 나이를 출력
// 27, 30, 27, 26

public class Practice05 {
	public static void main(String[] args) {
		int[] age = {27, 30, 27, 26};
		int avg, sum = 0;
		
		for (int i = 0; i < age.length; i++) {
			sum += age[i];
		}
		
		avg = sum / age.length;
		
		System.out.println("평균 나이는 : " + avg);
	}
}
