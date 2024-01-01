package exam15;

import java.util.HashSet;
import java.util.Iterator;

public class ItetatorTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("사과");
		set.add("감");
		set.add("귤");
		set.add("감자");
		set.add("포토");
		
		
		// set에 있는 데이터를 하나씩 꺼내서 반복실행
		// set 자체로는 반복할 수 있는 기능이 없다
		// iterator를 통해서 가능하다
		
		Iterator it = set.iterator();
		// hasNext 다음 데이터가 있냐
		// Iterator에 데이터가 있는 만큼 반복실행
		while (it.hasNext()) {
			// 데이터 가져오기
			String data = (String)it.next();
			System.out.println(data);
		}
	}

}
