package exam03;

// 클래스 변수
// 클래스를 구성하고 있는 속성은 객체마다 생성해야만 메모리가 확보
// 객체마다 별도의 메모리가 잡힘
// 객체를 통해서 접근

// 만약 객체와 무관하게 사용하고자 하는 변수가 필요하거나 모든 객체가 공통으로
// 사용하고자 하는 변수가 필요하다면 "클래스 변수"를 만들어 사용
// 클래스 변수는 변수명 앞에 static 키워드를 붙인다

public class Family {
	public String name;
	public int age;
	public static String addr;
}
