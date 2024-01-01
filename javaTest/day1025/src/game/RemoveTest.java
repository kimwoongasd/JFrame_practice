package game;

import java.util.ArrayList;

public class RemoveTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("포도");
		list.add("배");
		list.add("귤");
		list.add("감");
		
		// 리스트의 맨 첫번쨰 요소 삭제하고 삭제한 항목 출력
		// remove는 삭제된 요소를 반환한다
		String name = list.remove(0);
		System.out.println(name);
		System.out.println(list);
	}

}
