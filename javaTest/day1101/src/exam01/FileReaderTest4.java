package exam01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest4 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\data\\a.txt");
			
			int ch;
			
			while ((ch = fr.read()) != -1) {
				System.out.println((char)ch );
			}
			
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
