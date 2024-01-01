package exam03;

import java.util.ArrayList;

import exam02.Student;

public class Progamming8 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("칠복", "서울", "010"));
		list.add(new Student("인절미", "김포", "031"));
		list.add(new Student("초코", "인천", "032"));
		
		// 학생의 이름 출력
		for (Student s : list) {
			System.out.println(s.getName());
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			Student s = list.get(i);
//			String name = s.getName();
//			System.out.println(name);
//		}
	}

}
