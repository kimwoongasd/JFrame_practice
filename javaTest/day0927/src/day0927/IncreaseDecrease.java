package day0927;

public class IncreaseDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 5;
		y = 5;
		int r1 = ++x; // 증가 후 대입
		int r2 = y++; // 대입 후 증가
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		
		
		System.out.println("--------------------------");
		int i, j;
		i = 5;
		j = 5;
		++i;
		j++;
		
		System.out.println(i);
		System.out.println(j);
		
		
		
		System.out.println("----------------------");
		int a = 5;
		int b = 5;
		System.out.println(++a);
		System.out.println(b + 1);
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("--------------------");
		int age;
		age = 26;
		System.out.println(age);
		
		age++; // age = age + 1의 표현을 줄인 명령어
		System.out.println(age);
	}

}
