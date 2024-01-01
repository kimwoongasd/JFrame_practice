package exam07;

import java.util.ArrayList;
import java.util.Scanner;

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
		
		insert();
		pringAll();
		search();
		delete();
	}
}
