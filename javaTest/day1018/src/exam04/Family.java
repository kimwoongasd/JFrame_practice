package exam04;

// 클래스를 구성하고 있는 맴버변수에 접근하려면
// 객체를 구성하고 았눈 구 갹채룰 통해서 사용해야 하듯이
// 클래스를 구성하고 있는 맴버메소드에 접급하기 위해서
// 반드시 객체를 생성해야한다

// 만약 객체와 무관하게 객체 없읻 사용하려는 메소드가 있다면
// 클래스 메소드를 만드는데 메소드 앞에 static키워드 입력

// 클래스 메소드는 객체와 무관하게 객체 없이도 동작하는 메소드이기 떄문에
// 객체를 생성해야만 확보되는 메모리 영역인 일반 맴버변수에 접근 불가능
// 클래스 변수에만 접근가능

public class Family {
	public String name;
	public int age;
	public static String addr;
	
	// 클래스 변수 접근 가능
	public void sayHello() {
		System.out.println("안녕 " + name);
		System.out.println("주소 " + addr);
	}
	
	public static void pro() {
		// static 메소드에서는 static 맴버에만 접근이 가능
//		System.out.println("이름 " + name);
//		System.out.println("나이 " + age);
		System.out.println("주소 " + addr);
		System.out.println("Family 클래스의 pro입니다");
	}
}
