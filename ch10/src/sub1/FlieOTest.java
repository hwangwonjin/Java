package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*날짜 : 2022/09/13
 * 이름 : 황원진
 * 내용 : 파일 입출력 스트림 실습하기
 * 
 * 입출력 스트림
 * 	파일(FIle) 컴퓨터 저장매체(HDD)에 저장되는 데이터 묶음
 * 	프로그램은 데이터 처리와 함꼐 데이터 저장을 위해 파일 입출력 수행
 * 	파일 입출력을 위해 입출력 스트림을 사용
 * 
 */
public class FlieOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java2\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\java2\\Desktop\\Sample2.txt";

		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
				
			while(true) {
				
				//파일 읽기
				int date = fis.read();
				
				if(date == -1) {
					break;// 파일을 다 읽었을 경우
				}
				//데이터 출력
				char c = (char)date;
				System.out.print(c);
				
				//파일 쓰기
				fos.write(date);
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
