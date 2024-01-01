package exam08;

import java.util.ArrayList;

public class MapTest {

	public static void main(String[] args) {
		// 리스트에 이름, 주소, 전화를 저장
		ArrayList<String> info = new ArrayList<String>();
		
		info.add("유재성");
		info.add("서울");
		info.add("111-111-111");
		
		
		System.out.println(info.get(2));
		
		// 리스트는 인덱스로 데이터에 접근하는 방식
		// map은 key, value 형태를 가지고있고 key를 통해서 데이터에 접근한ㄷ
		
	}
}
