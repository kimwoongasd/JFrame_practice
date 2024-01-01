package exam02;

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
	
	
	
	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}

	public String getProfession() {
		return "학생";
	}
}
