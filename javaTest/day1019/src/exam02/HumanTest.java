package exam02;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("춘향", 18);
		Human h2 = new Human("몽룡", 21);
		Human h3 = new Human("사또", 50);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		System.out.println("---------------------------");
		Student s1 = new Student("명진", 21, "컴퓨터");
		Student s2 = new Student("미현", 22, "경영");
		Student s3 = new Student("용준", 24, "경제");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println("----------------------------");
		System.out.println(h1.getName() + ", " + h1.getProfession());
		System.out.println(s1.getName() + ", " + s1.getProfession());
	}

}
