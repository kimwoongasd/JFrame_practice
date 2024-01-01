package exam04;

public class FamliyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family.addr = "서울시 마포구";
		// 클래스 변수는 객체와 무관하게 사용 가능
		
		System.out.println(Family.addr);
		
		Family.pro();
		Family f = new Family();
		// 클래스 메소드는 객체와ㅣ 무관하게 사용가능
	}
}
