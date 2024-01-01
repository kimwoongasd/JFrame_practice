package exam01;

public class Student extends Human {
	private String major;

	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student 생성자 동작함"); 
	}
	
	// 부모클래스의 동일한 이름의 맴버를 접근하기 위해서 super를 사용
	public String toString() {
		return super.toString() + " 전공 " + major;
	}
	
	public String getProfession() {
		return "학생";
	}
}
