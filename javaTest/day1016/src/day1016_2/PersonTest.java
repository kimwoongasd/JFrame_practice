package day1016_2;

class Person {
	private String name;
	private int age;
	
	// private 영역의 name의 값을 바꾸는 메소드
	public void setName(String n) {
		name = n;
	}
	
	// private 영역의 age의 값을 바꾸는 메소드
	public void serAge(int a) {
		age = a;
	}
	
	// private 영역의 name의 값을 가져오는 메소드
	public String getName() {
		return name;
	}
	
	// private 영역의 age의 값을 가져오는 메소드
		public int getAge() {
			return age;
		}
	
	public void eat(String food) {
		System.out.printf("%d살 %s가 %s를 먹는다\n", age, name, food);
	}
	
	public void sleep(int hours) {
		System.out.printf("%d살 %s가 %d째 자고있다\n", age, name, hours);
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person kim;
		kim = new Person();
		
		
		// Person클래스를 만들떄에 속성(맴버변수)인 name과 age는
		// 은닉성을 적용하여 prㅑvate 영역에 두었기 때문에 외부에 노출되지 않는다
		// name 변수에 private를 했기 떄문에 접근 불가능
//		kim.name = "김";
		
		// 접근하는 방법 -> public에 있는 메소드를 통해서 접근
		kim.setName("솜솜");
		kim.serAge(9);
		
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		
	}

}
