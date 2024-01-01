package exam06;

import java.util.ArrayList;
import java.util.Scanner;

import exam04.Student;

public class ArrayListTest {

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
					// set : i번재를 x값으로 바꾼다
					list.set(i, list.get(j));
					list.set(j, s);
				}
			}
		}
	}
	
//	public static String getMost(ArrayList<Student> list) {
//		ArrayList<String> top = new ArrayList<String>();
//		String name = "";
//		int max = 0;
//		
//		for (Student s : list) {
//			if (s.getTotal() > max) {
//				max = s.getTotal();
//			}
//		}
//		
//		for (Student s : list) {
//			if (max == s.getTotal()) top.add(s.getName());
//		}
//		
//		for (String x : top) {
//			name += x + " ";
//		}
//		
//		return name;
//	}
	
	public static ArrayList<String> getMost(ArrayList<Student> list) {
		ArrayList<String> top = new ArrayList<String>();
		int max = 0;
		
		for (Student s : list) {
			if (s.getTotal() > max) {
				max = s.getTotal();
			}
		}
		
		// 최고점수와 같은 점수면 list에 추가
		for (Student s : list) {
			if (max == s.getTotal()) top.add(s.getName());
		}
		
		return top;
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
	
		list.add(new Student("김종민", 80, 90, 70));
		list.add(new Student("박수홍", 100, 100, 90));
		list.add(new Student("이수만", 50, 30, 80));
		list.add(new Student("조조", 60, 50, 80));
		list.add(new Student("임아니", 80, 90, 100));
		list.add(new Student("강호동", 100, 90, 100));
		list.add(new Student("유재석", 80, 90, 100));
		list.add(new Student("이수근", 100, 90, 100));
		
//		sortStudent(list);
		printStudent(list);
		
//		System.out.println("성적이 가장 높은 사람 : " + getMost(list));
		ArrayList<String> topList = getMost(list);
		System.out.println("성적이 가장 높은 사람 : " + topList);
	}
}
