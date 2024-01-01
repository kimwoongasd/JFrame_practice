package exam01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest2 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\data\\a.txt");
			
			System.out.println((char)fr.read());
			System.out.println((char)fr.read());
			System.out.println((char)fr.read());
			System.out.println((char)fr.read());
			System.out.println(fr.read());
			
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
