package exam03;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterTest {

	public static void main(String[] args) {
		try {
			// 파일 생성
			FileWriter fw = new FileWriter("C:\\data\\hello.txt");
			fw.write("아싸 금요일");
			
			// 파일 생성 후 닫아줘야한다
			fw.close();
			System.out.println("파일생성 완료"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
