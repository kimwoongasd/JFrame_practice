package exam09;

import java.util.ArrayList;
import java.util.Scanner;

import exam08.Student;

public class Progamming8 {
	public static void insert() {
		System.out.println("학생의 정보를 등록하였습니다");
	}
	
	public static void pringAll() {
		System.out.println("모든 학생의 정보를 출력하였습니다");
	}
	
	public static void search() {
		System.out.println("학생의 정보를 검색하였습니다");
	}
	
	public static void delete() {
		System.out.println("학생의 정보를 삭제하였씁니다");
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("원하는 동작을 입력하시오"
					+ "[1 : 정보, 2 : 출력, 3 : 검색, 4: 삭제, 종료 : 0]");
			n = sc.nextInt();
			
			switch (n) {
				case 1: insert(); break;
				case 2: pringAll(); break;
				case 3: search(); break;
				case 4: delete(); break;
			}
			
			if (n == 0) break;
		}
		System.out.println("프로그램 종료");
		
		
	}
}
