package exam05;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "햄버거,칼국수,김치찌게,감자튀김,돈까스,순대국";
		
		// StringTokenizer : 문자열을 특정 문자로 나누는 것
		StringTokenizer st = new StringTokenizer(data, ",");
		
		System.out.println(st);
		// null은 아무데도 참조하지 않는것을 의미
		StringTokenizer st2 = null;
		System.out.println(st2);
		
		// hasMoreTokens : 다음 문자열이 있는지 확인 --> boolean 반환
//		while (st.hasMoreTokens()) {
//
//			String food = st.nextToken();
//			System.out.println(food);
//		}
	}

}
