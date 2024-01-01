package day1016;

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
		int n;
		Student s;
		n = 10;
		// 객체 생성
		s = new Student();
		s.name = "낌";
		s.kor = 509;
		System.out.println(s.name);

	}

}
