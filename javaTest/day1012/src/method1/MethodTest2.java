package method1;


class MyUtil1 {
	public void sayHello (String name) {
		for (int i = 0; i < 3; i++) {
			System.out.println("hello " + name);
		}
	}
	
}

public class MethodTest2 {

	public static void main(String[] args) {
		MyUtil1 mu = new MyUtil1();
		mu.sayHello("김");
		String title = "java";
		System.out.println(title);
		mu.sayHello("이");
		int year = 203;
		System.out.println(year);	
		mu.sayHello("조");
	}

}
