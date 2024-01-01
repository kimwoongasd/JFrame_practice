package exam18;

interface InterA{}
interface InterB{}
class MyClass implements InterA, InterB {}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		InterA a;
		InterB b;
		
		a = obj;
		b = obj;
		b = (InterB)a;
		// 자식은 부모 참조 불가능
//		obj = a;
//		obj = b;
		b = (InterB)a;
	}

}
