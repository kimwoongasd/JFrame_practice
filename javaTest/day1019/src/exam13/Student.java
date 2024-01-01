package exam13;

public class Student {
	protected String name;
	protected String no;
	protected String major;
	protected int grade;
	protected double score;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public Student(String name, String no, String major, int grade, double score) {
		super();
		this.name = name;
		this.no = no;
		this.major = major;
		this.grade = grade;
		this.score = score;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "이름 = " + name + ", 학번 = " + no + ", 학과 = " + 
	major + ", 학년 = " + grade + ", 학점 = " + score
				;
	}
	
	
	
	
	
}
