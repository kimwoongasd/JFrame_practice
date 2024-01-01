package exam03;

public class FamliyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family.addr = "서울시 마포구";
		// 클래스 변수는 객체와 무관하게 사용 가능
		
		System.out.println(Family.addr);
		
		Family f = new Family();
		
		f.name = "김철수";
		f.age = 33;
		
		Family m = new Family();
		m.name = "용옹";
		m.age =  27;
		
		System.out.println(f.name);
		System.out.println(f.age);
		System.out.println(f.addr);
		System.out.println(f.name);
		System.out.println(f.age);
		System.out.println(f.addr);
		System.out.println("------------------------------");
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.addr);
		System.out.println("------------------------------");
		
		f.addr = "제주도 서귀포시";
		System.out.println(f.name);
		System.out.println(f.age);
		System.out.println(f.addr);
		System.out.println(f.name);
		System.out.println(f.age);
		System.out.println(f.addr);
		System.out.println("------------------------------");
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.addr);
	}
}
