package exam01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\data\\a.txt");
			
			// int로 한글자씩 가져온다
			// 더이상 가져올 값이 없으면 -1를 가져온다
			int c1 = fr.read();
			
			System.out.println(c1);
			System.out.println((char)c1);
			
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
