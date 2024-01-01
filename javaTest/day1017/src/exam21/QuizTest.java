package exam21;

public class QuizTest {

	public static void main(String[] args) {
		Computer cp = new Computer("화이트", "삼성", false, false);
		
		System.out.println("색깔 : " + cp.getColor());
		System.out.println("제조회사 : " + cp.getMaker());
		System.out.println("전원 : " + cp.isPower());
		System.out.println("소리 : " + cp.isSound());
		System.out.println("--------");
		
		// 전원, 소리 키기
		cp.onPower();
		cp.onSound();
		
		System.out.println("색깔 : " + cp.getColor());
		System.out.println("제조회사 : " + cp.getMaker());
		System.out.println("전원 : " + cp.isPower());
		System.out.println("소리 : " + cp.isSound());

	}

}
