package day1016_a;

import java.util.Scanner;

// 기본자료형 : 변수 자신이 값을 가진다
// 참조자료형 : 변수 자신이 값을 갖는것이 아니라 값이 있는 메모리를 참조

//Student 라는 이름으로 새로운 자료형
class Student {
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	
}

public class StudentTest2 {

	public static void main(String[] args) {
		// 한명의 정보를 입력받아 총점, 평군을 게산하여 출력
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		System.out.println("이름을 입력하시오");
		s.name = sc.next();
		System.out.println("국어 점수을 입력하시오");
		s.kor = sc.nextInt();
		System.out.println("수학 점수을 입력하시오");
		s.math = sc.nextInt();
		System.out.println("영어 점수을 입력하시오");
		s.eng = sc.nextInt();
		
		s.tot = s.eng + s.kor + s.math;
		s.avg = s.tot / 3.0;
		
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", s.name, s.kor, s.eng, s.math, s.tot, s.avg);
	
		
	}

}
