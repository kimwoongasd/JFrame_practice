package exam02;

import java.util.ArrayList;

public class Progamming8 {

	public static void main(String[] args) {
		// 재네릭에 클래스 student를 설정했기 때문에 list에 student 객체를 생성해하고 넣어야 한다
		ArrayList<Student> list = new ArrayList<Student>();
		
		// 초코, 서울, 100
//		Student s = new Student("초코", "서울", "100");
//		list.add(s);
		list.add(new Student("초코", "서울", "100"));
		
		// 솜솜, 인천, 111
		list.add(new Student("솜솜", "인천", "111"));
		
		// 칠복, 부산, 222
		list.add(new Student("칠복", "부산", "222"));
		
		System.out.println(list.get(0));
		
//		Student s1 = list.get(1);
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		for (Student s : list) {
			System.out.println(s);
		}
		
		
	}
}
