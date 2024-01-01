package exam13;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 여러명을 만드려면 배열이 필요하다
		// UnderGraduat, Graduate를 담으려면 
		// UnderGraduat Graduate의 자료형인 Student로 만들어야한다
		Student[] arr = new Student[3];
		
		arr[0] = new UnderGraduate("메시", "20221011", "축구", 2, 80, "축구부");
		arr[1] = new Graduate("김동현", "19980502", "체육", 4, 20, 0.6, "교육조교");
		arr[2] = new Graduate("강호동", "18980502", "인공지능", 2, 70, 0.6, "교육조교");
		
		
		for (Student s: arr) {
			System.out.println(s);
			
			// Graduate의 객체인지 확인
			if (s instanceof Graduate) {
				// Graduate의 부모인 Student에는 paperReview메소드가 없기 때문에
				// 자식클래스에 추가된 메소드를 호출하려면 자식 클래스로 자료형변환 해야한다
				// int, double 바꾸듯이 변경가능
				((Graduate) s).paperReview();
			}
		}
	}

}
