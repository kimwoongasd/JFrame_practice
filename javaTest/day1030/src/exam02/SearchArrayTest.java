package exam02;

public class SearchArrayTest {
	
	public void search(int [] arr, int value) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("배열에 데이터가 있따");
				flag = true;
				break;
			}
		}
		
		if (flag == false) {
			try {
				throw new NotFoundException("배열에 데이터 없음");
			} catch (Exception e) {
				System.out.println("에외 발생 " + e.getMessage());
			}
			
		}
	}

}
