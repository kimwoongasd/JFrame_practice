package exam09;

class Rect{
	public void drea() {
		System.out.println("사각형을 그립니다");
	}
}

public class MapTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = "exam09.Rect";
		
		// 문자열로 된 클래스의 객체를 생성해 보자
		// 클래스 이름과 위치를 정확히 알아야 사용 가능
		Rect r = (Rect)Class.forName(className).newInstance();
		r.drea();
		
	}

}
