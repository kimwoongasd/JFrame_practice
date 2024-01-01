package day1016;

/*
한명의 학생의 정보를 처리하기 위한 이름,국어, 수학, 총점, 평균 6가지 속성으로
구성된 새로운 자료형을 만들면 프로그램이 간결

 이렇게 새로운 자료형을 만들기 위하여 자바에서는 클래스를 이용한다
 
 클래스는 사용자 정의 새로운 자료형이다
*/


import java.util.Scanner;

public class StudentTEst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor =  new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] tot = new int[5];
		double[] avg = new double[5];
		
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "번 학생의 이름 : ");
			name[i] = sc.next();
			
			System.out.println((i + 1) + "번 학생 국어 점수 : ");
			kor[i] = sc.nextInt();
			System.out.println((i + 1) + "번 학생 영어 점수 : ");
			eng[i] = sc.nextInt();
			System.out.println((i + 1) + "번 학생 수학 점수 : ");
			math[i] = sc.nextInt();
			
			tot[i] = kor[i] + math[i] + eng[i];
			avg[i] = (double)tot[i] / 3.0;
		}
		
		System.out.println("이름\t 국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t %d\t%d\t%d\t%d\t%.1f\n", name[i], kor[i], eng[i], math[i], tot[i], avg[i]);
		}
		
		// 성적이 높은순으로 정렬
		for (int i = 0; i< name.length - 1; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (tot[i] < tot[j]) {
					int tem = tot[i];
					tot[i] = tot[j];
					tot[j] = tem;
					
					tem = math[i];
					math[i] = math[j];
					math[j] = tem;
					
					tem = eng[i];
					eng[i] = eng[j];
					eng[j] = tem;
					
					tem = kor[i];
					kor[i] = kor[j];
					kor[j] = tem;
					
					String d = name[i];
					name[i] = name[j];
					name[j] = d;
					
					double e = avg[i];
					avg[i] = avg[j];
					avg[j] = e;
				}
			}
		}
		
		System.out.println("이름\t 국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t %d\t%d\t%d\t%d\t%.1f\n", name[i], kor[i], eng[i], math[i], tot[i], avg[i]);
		}
		
	}

}
