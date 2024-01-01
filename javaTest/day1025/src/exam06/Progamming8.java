package exam06;

import java.util.ArrayList;
import java.util.Scanner;

import exam07.Student;

public class Progamming8 {
	
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		System.out.println("찾고자 하는 학생");
		// 리스트에서 이름이 초코를 찾아 주소와 전화번호를 출력
		String keword = sc.next();
		
		list.add(new Student("칠복", "서울", "010"));
		list.add(new Student("인절미", "김포", "031"));
		list.add(new Student("초코", "인천", "032"));
		list.add(new Student("딸기", "전주", "042"));
		list.add(new Student("시바", "부산", "051"));
		
		
		boolean flag = true;
		for (Student s : list) {
			if (s.getName().equals(keword)) {
				flag = false;
				System.out.printf("주소 : %s  전화번호 : %s", s.getAddr(), s.getPhone());
			}
		}
		
		if (flag) {
			System.out.println("찾는 이름 없음");
		}
	}
}
