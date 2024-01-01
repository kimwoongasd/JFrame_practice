package day1016;


// 실수형 1차원 배열을매개변수로 전달받아 내림차순 정렬하는 메소드를 정의
class ArrayUtil {
	public void descening (double[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					double tem = a[i];
					a[i] = a[j];
					a[j] = tem;
				}
			}
		}
		
		for (double x : a) {
			System.out.println(x + " ");
		}
	}
}


public class SortDescndingTest {

	public static void main(String[] args) {
		ArrayUtil au = new ArrayUtil();
		double[] a = {10.5, 6.5, 2.5, 1.6, 8.5};
		
		au.descening(a);
		
		
	}

}
