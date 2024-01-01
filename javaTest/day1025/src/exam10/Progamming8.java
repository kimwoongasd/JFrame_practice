package exam10;

import java.util.ArrayList;
import java.util.Scanner;

import exam08.Student;

public class Progamming8 {
	
	public static void insert(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		String name, addr, phone;
		System.out.println("추가할 학생 정보를 입력하시오");
		System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("주소를 입력하시오");
		addr = sc.next();
		System.out.println("전화번호를 입력하시오");
		phone = sc.next();

		arr.add(new Student(name, addr, phone));
		
		System.out.println("학생의 정보를 등록하였습니다");
	}
	
	public static void pringAll(ArrayList<Student> arr) {
		System.out.println("모든 학생의 정보를 출력하였습니다");
		System.out.println("이름\t주소\t전화");
		for (Student s : arr) {
			System.out.printf("%s\t%s\t%s\n", s.getName(), s.getAddr(), s.getPhone());
		}
	}
	
	public static void search(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 학생의 이름을 입력하시오");
		String name = sc.next();
		boolean flag = true;
		
		for (Student s : arr) {
			if (s.getName().equals(name)) {
				flag = false;
				System.out.println(s);
			}
		}
		
		if (flag) System.out.println("학생이 없습니다");
		
	}
	
	public static void delete(ArrayList<Student> arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 학생의 이름을 입력하시오");
		String name = sc.next();
		
		boolean flag = true;
		
		for (int i = 0; i < arr.size(); i++) {
			String ch = arr.get(i).getName();
			if (ch.equals(name)) {
				arr.remove(i);
				flag = false;
				System.out.println(name + "학생을 삭제했습니다");
			}
		}
		
//		for (Student s : arr) {
//			String ch = s.getName();
//			if (ch.equals(name)) {
//				arr.remove(ch);
//				flag = false;
//				System.out.println(name + "학생을 삭제했습니다");
//			}
//		}
		
		if (flag) System.out.println("삭제할 학생이 없습니다");
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("칠복", "서울", "111"));
		list.add(new Student("몽이", "인천", "222"));
		list.add(new Student("덩이", "안산", "333"));
		list.add(new Student("솜솜", "안성", "444"));
		list.add(new Student("초코", "대전", "555"));
		
		
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("원하는 동작을 입력하시오"
					+ "[1 : 정보, 2 : 출력, 3 : 검색, 4: 삭제, 종료 : 0]");
			n = sc.nextInt();
			
			switch (n) {
				case 1: insert(list); break;
				case 2: pringAll(list); break;
				case 3: search(list); break;
				case 4: delete(list); break;
			}
			
			if (n == 0) break;
		}
		System.out.println("프로그램 종료");
		
	}
}
