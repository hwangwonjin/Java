package sub1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*날짜 : 2022/09/14
 *이름 : 황원진
 *내용 : 문자 스트림 실습하기
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java2\\Desktop\\Sample1.txt";
		
		try {
			FileReader fr = new FileReader(path);
			
			while(true) {
				int data = fr.read();
				
				if(data == -1) {
					break;
				}
				
				char c = (char) data;
				System.out.print(c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
}
