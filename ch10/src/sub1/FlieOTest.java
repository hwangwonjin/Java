package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*날짜 : 2022/09/13
 * 이름 : 황원진
 * 내용 : 파일 입출력 스트림 실습하기
 */
public class FlieOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java2\\Desktop\\Sample1.txt";

		try {
			FileInputStream fis = new FileInputStream(path);
	
			while(true) {
				int date = fis.read();
				
				if(date == -1) {
					break;// 파일을 다 읽었을 경우
				}
				char c = (char)date;
				System.out.print(c);
			}
			//스트림 해제
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		System.out.println("프로그램 종료...");
	}
}
