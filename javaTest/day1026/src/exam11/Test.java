package exam11;

class Person {
	public void sayHello() {
		System.out.println("hi");
	}
}

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 문자열로 된 클래스 이름을 알고 있으면 그 객체를 생성할 수 있다
		// Class라는 이름의 클래스의 forName메소드와 newInstance메소드를 이용한다
		
		
		// 문자열로 된 클래스이름을 갖고 객체생성 준비
		Class obj = Class.forName("exam11.Person");
		
		// 해당 객체를 생성
		// newInstance메소드는 자바의 제일 조상인 Object를 반환한다
		// 그래서 해당 객체의 클래스로 형변환 하여 저장한다
		Person p = (Person)obj.newInstance();
		
		
	}

}
