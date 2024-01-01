package day1016_c;

import java.util.Scanner;

// 기본자료형 : 변수 자신이 값을 가진다
// 참조자료형 : 변수 자신이 값을 갖는것이 아니라 값이 있는 메모리를 참조

//Student 라는 이름으로 새로운 자료형
class Student {
	String name;
	int age;
	
}

public class StudentTest2 {

	public static void main(String[] args) {
		int n;
		n = 100;
		
		Student[] arr = new Student[3]; // 객체 생성x, 배열 만든것
		arr[0] = new Student();
		arr[1] = new Student();
		arr[2] = new Student();
		
		
		// 참조변수는 객체를 생성하고 사용해야 한다
		// 객체를 생성하지 않아 에러
//		Student kim; 
//		kim.age = 12;
	}

}
