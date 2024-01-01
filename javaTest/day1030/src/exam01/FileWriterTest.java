package exam01;

import java.io.FileWriter;
import java.io.IOException;

/*
public FileWriter(String fileName)
        throws IOException

파일을 풀력하기 위해서는 위와같은 생성자를 이용하여
갹채룰 생성해야 하는데 이 생성자는 IOException를 갖고 있다
이것은 RuntimeExcetion의 후손이 아니기 떄문에 사용자가 예외처리 해야한다
        
*/

public class FileWriterTest {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\data\\hello.txt");
			fw.write("hello");
			fw.close();
			System.out.println("파일을 생성하였씁니다"); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
