package exam06;

import java.util.StringTokenizer;

public class Mydate {
	public Mydate(String data) throws IllegalArgumentException {
			if (data == null) {
				throw new IllegalArgumentException("null 입니다");
			}
			
			StringTokenizer st = new StringTokenizer(data, "/");		
			String year = st.nextToken();
			String month = st.nextToken();
			String date = st.nextToken();
			
			System.out.println(year + "년 " + month + "월 " + date + "일");
		
	}
}
