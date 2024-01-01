package day1016_b;

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
		// 5명 학생의 정보를 입력받아 총점, 평균을 계산하고 출력
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[5]; // 배열 생성
		
		
		for (int i = 0; i < 5; i++) {
			st[i] = new Student(); // 객체 생성
			System.out.println((i + 1) + "번 학생의 이름 ");
			st[i].name = sc.next();
			System.out.println((i + 1) + "번 학생의 국어  ");
			st[i].kor = sc.nextInt();
			System.out.println((i + 1) + "번 학생의 영어  ");
			st[i].eng = sc.nextInt();
			System.out.println((i + 1) + "번 학생의 수학  ");
			st[i].math = sc.nextInt();
			
			st[i].tot = st[i].math + st[i].eng + st[i].kor;
			st[i].avg = st[i].tot / 3.0;
		
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (Student s : st) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", s.name, s.kor, s.eng, s.math, s.tot, s.avg);
		}
	}

}
