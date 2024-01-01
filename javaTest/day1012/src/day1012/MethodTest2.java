package day1012;


class MyUtil1 {
	public void sayHello () {
		System.out.println("hello 김");
		System.out.println("hello 김");
		System.out.println("hello 김");
		return;
	}
	
}

public class MethodTest2 {

	public static void main(String[] args) {
		MyUtil1 mu = new MyUtil1();
		mu.sayHello();
		String title = "java";
		System.out.println(title);
		mu.sayHello();
		int year = 203;
		System.out.println(year);	
		mu.sayHello();
	}

}
