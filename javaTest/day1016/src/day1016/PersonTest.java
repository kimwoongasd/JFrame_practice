package day1016;

class Person {
	String name;
	int age;
	
	public void eat(String food) {
		System.out.printf("%d살 %s가 %s를 먹는다\n", age, name, food);
	}
	
	public void sleep(int hours) {
		System.out.printf("%d살 %s가 %d째 자고있다\n", age, name, hours);
	}
}

public class PersonTest {

	public static void main(String[] args) {
		double data;
		data = 20;
		Person kim; // 참조 자료형은 바로 값을 넣을 수 없고 객체를 생성하고 넣어야한다
		kim = new Person();
		kim.name = "솜";
		kim.age = 12;
		
		kim.sleep(12);
		kim.eat("바나나");
		
		Person lee;
		lee = new Person();
		lee.name = "이";
		lee.age = 15;
		
		lee.sleep(8);
		lee.eat("가슴살");
	}

}
