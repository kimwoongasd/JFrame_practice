package exam11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import exam08.Student;

public class Progamming9 {
	
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("칠복", "서울", "111"));
		list.add(new Student("몽이", "인천", "222"));
		list.add(new Student("덩이", "안산", "333"));

		
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		for (Student s : list) {
			System.out.println(s);
			list.remove(s);
		}
		
//		Iterator<Student> iterator = list.iterator();
//		
//		while (iterator.hasNext()) {
//			Student str = iterator.next();
//			if (str.getName().equals(name)) {
//				iterator.remove();
//			}
//		}
//		
//		System.out.println(list);
		
	}
}
