package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*날짜 : 2022/09/14
 * 이름 : 황원진
 * 내용 : 역직렬화
 * 
 */
public class DeserializeTest {
	public static void main(String[] args) {
	
	String path = "C:\\Users\\java2\\Desktop\\Apple.dat";
	
	try {
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		//객체 가져오기
		Apple apple = (Apple) ois.readObject();
		
		ois.close();
		fis.close();
		
		apple.show();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		System.out.println("프로그램 종료..");
}
}
