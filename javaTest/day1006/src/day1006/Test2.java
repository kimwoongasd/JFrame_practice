package day1006;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, sum = 0;
		while (i < 10 ) {
			i++;
			if (i % 3 == 0) continue;
			System.out.println(i);
			sum += i;
			if (sum > 20) break;
		}
	}

}
