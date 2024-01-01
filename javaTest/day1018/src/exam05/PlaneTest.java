package exam05;

public class PlaneTest {

	public static void main(String[] args) {
		System.out.println("만들어진 비행기 수 : " + Plane.getPlanes());
		
		Plane p = new Plane("에어부산", "A380", 100);
		System.out.println("------------------------");
		System.out.println("제작사 : " + p.getProducer());
		System.out.println("모델명 : " + p.getModel());
		System.out.println("최대 승객수 : " + p.getPassenger());
		System.out.println("만들어진 비행기 수 : " + Plane.getPlanes());
		
		Plane p2 = new Plane("에어서울", "B380", 100);
		System.out.println("------------------------");
		System.out.println("제작사 : " + p2.getProducer());
		System.out.println("모델명 : " + p2.getModel());
		System.out.println("최대 승객수 : " + p2.getPassenger());
		System.out.println("만들어진 비행기 수 : " + Plane.getPlanes());
		
		Plane p3 = new Plane("진에어", "C380", 100);
		System.out.println("------------------------");
		System.out.println("제작사 : " + p3.getProducer());
		System.out.println("모델명 : " + p3.getModel());
		System.out.println("최대 승객수 : " + p3.getPassenger());
		System.out.println("만들어진 비행기 수 : " + Plane.getPlanes());
		
		Plane p4 = new Plane();
		p4.setProducer("대한");
		p4.setModel("AA");
		p4.setPassenger(500);
		
		System.out.println("------------------------");
		System.out.println("제작사 : " + p4.getProducer());
		System.out.println("모델명 : " + p4.getModel());
		System.out.println("최대 승객수 : " + p4.getPassenger());
		System.out.println("만들어진 비행기 수 : " + Plane.getPlanes());
	}

}
