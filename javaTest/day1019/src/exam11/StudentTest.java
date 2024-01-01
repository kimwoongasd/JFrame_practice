package exam11;

public class StudentTest {

	public static void main(String[] args) {
		
		// UnderGraduate의 부모가 Student이기 떄문에 
		// Student의 참조변수로 UnderGraduate객체 생성 가능
		Student u = new UnderGraduate("초코", "1019", "컴퓨터", 3, 22.0, "축구");
		System.out.println(u);
		
		
		// Graduate 부모가 Student이기 떄문에 
		// Student의 참조변수로 Graduate 객체 생성 가능
		Student g = new Graduate("바나나", "1011", "수학", 4, 35.5, 0.5, "교육 조교");
		System.out.println(g);

	}

}
