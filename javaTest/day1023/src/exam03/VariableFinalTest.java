package exam03;

/*
 * Person 객체를 만들때 마다 Person의 변수들은 별도의 메모리 공간이 필요하다
 * 변경하지 못하는 addr를 별도의 메모리 공간을 확보할 필요가 없다
 * 그래서 final이면 static으로 하는게 효율적이다
 * 
 * 
 * 	Static 키워드를 사용한다는 것은 메모리에 한번 할당되어 프로그램이 종료될 때 해제되는 것을 의미
 *  static은 정적맴버들은 Heap영역이 아닌 Static영역에 할당된다
 *  static영억에 할당된 메모리는 모든 객체가 공유한다
*/

class Person {
	String name = "길동";
	int age = 20;
	final String addr = "서울";
}

public class VariableFinalTest {

	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		System.out.println(a.name + ", " + a.age + ", " + a.addr);
		
		a.age = 25;
		System.out.println(a.name + ", " + a.age + ", " + a.addr);
		
//		a.addr = "부산" // 상수는 변경 불가능
		System.out.println(a.name + ", " + a.age + ", " + a.addr);
	}

}
