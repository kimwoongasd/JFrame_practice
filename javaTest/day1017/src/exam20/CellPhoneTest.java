package exam20;

public class CellPhoneTest {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone("아이폰15", "애플", "화이트", false, true);
		
		System.out.println("모델명 : " + cp.getModel());
		System.out.println("제조회사 : " + cp.getMaker());
		System.out.println("색상 : " + cp.getColor());
		System.out.println("전원 : " + cp.isPower());
		System.out.println("카메라 장착 여부 : " + cp.isCamera());
		System.out.println("------------");
		// 전원 키기
		cp.powerOn();
		
		System.out.println("모델명 : " + cp.getModel());
		System.out.println("제조회사 : " + cp.getMaker());
		System.out.println("색상 : " + cp.getColor());
		System.out.println("전원 : " + cp.isPower());
		System.out.println("카메라 장착 여부 : " + cp.isCamera());
		System.out.println("------------");
	}

}
