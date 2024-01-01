package day0926;

public class PrintFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		double height;
		
		name = "김";
		age = 29;
		height = 129.86;
		
		System.out.printf("이름은 %s \n", name);
		System.out.printf("나이는 %d \n", age);
		System.out.printf("키는 %f \n", height);
		System.out.println("---------------------");
		System.out.printf("이름 : %s 나이 : %d 키 : %f \n", name, age, height);
		
		// 칸 수
		System.out.printf("이름 : %10s 나이 : %5d 키 : %f \n", name, age, height);
	}

}
