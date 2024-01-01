package day1010;

public class arrayIndex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[5];
		
		for (int i = 0; i < 5; i++) {
			numbers[i] = i + 1;
		}
		
		for (int i : numbers) {
//			System.out.println(numbers[i - 1]);
			System.out.println(i);
		}
	}

}
