package exam04;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	
	public static void inputInfo(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		int n, eng, kor, math;
		String name;
		
		while (true) {
			System.out.println("학생 정보 입력 == 1, 종료 == 0");
			n = sc.nextInt();
			
			if (n == 0) break;
			
			System.out.println("학생이름을 입력하시오");
			name = sc.next();
			System.out.println("국어 점수을 입력하시오");
			kor = sc.nextInt();
			System.out.println("영어 점수을 입력하시오");
			eng = sc.nextInt();
			System.out.println("수학 점수을 입력하시오");
			math = sc.nextInt();
			
			list.add(new Student(name, kor, eng, math));
		}
	}
	
//	public static void getTotalAgv(ArrayList<Student> list) {
//		for (Student s : list) {
//			int sum = s.getEng() + s.getKor() + s.getMath();
//			s.setTotal(sum);
//			s.setAvg(s.getTotal() / 3.0);
//			
//			System.out.printf("%s의 총점 : %d, 평균 : %f\n",
//					s.getName(), s.getTotal(), s.getAvg());
//		}
//	}
	
	public static void printStudent(ArrayList<Student> list) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (Student s : list) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",
					s.getName(), s.getKor(), s.getEng(), s.getMath(),
					s.getTotal(), s.getAvg());
		}
	}
	
	// 정렬
	public static void sortStudent(ArrayList<Student> list) {
		
		for(int i = 0; i < list.size(); i++) {
			for (int j = i; j <list.size(); j++) {
				if (list.get(i).getTotal() < list.get(j).getTotal()) {
					Student s = list.get(i);
					list.set(i, list.get(j));
					list.set(j, s);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		// 학생입력
//		inputInfo(list);
		
		list.add(new Student("김", 80, 90, 100));
		list.add(new Student("박", 70, 50, 60));
		list.add(new Student("이", 50, 30, 80));
		list.add(new Student("저", 60, 50, 80));
		list.add(new Student("임", 80, 50, 90));
		
		sortStudent(list);
		printStudent(list);
	}
}
