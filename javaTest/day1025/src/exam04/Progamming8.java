package exam04;

import java.util.ArrayList;

public class Progamming8 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("칠복", "서울", "010"));
		list.add(new Student("인절미", "김포", "031"));
		list.add(new Student("초코", "인천", "032"));
		list.add(new Student("딸기", "전주", "042"));
		list.add(new Student("시바", "부산", "051"));
		
		// 리스트에서 이름이 초코를 찾아 주소와 전화번호를 출력
		String keword = "시바";
		for (Student s : list) {
			if (s.getName().equals(keword)) {
				System.out.printf("주소 : %s  전화번호 : %s", s.getAddr(), s.getPhone());
			}
		}
		
	}
}
