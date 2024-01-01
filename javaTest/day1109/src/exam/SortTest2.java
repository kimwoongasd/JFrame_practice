package exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
 		try {
 			System.out.println("데이터 읽기 시작");
 			ObjectInputStream ois =
 					new ObjectInputStream(new FileInputStream("C:\\data\\num.txt"));
 			
 			System.out.println("정렬");
 			arr = (ArrayList<Integer>)ois.readObject();
 			// 정렬
 			Collections.sort(arr);
 			
 			ois.close();
			
			
 			System.out.println("파일 쓰기");
 			ObjectOutputStream oos =
 					new ObjectOutputStream(new FileOutputStream("C:\\data\\sortNum2.txt"));
 			
			oos.writeObject(arr);
			oos.close();
			
		} catch (Exception e) {
			System.out.println("파일 오류 : " + e.getMessage());
		}
		
	}
}
