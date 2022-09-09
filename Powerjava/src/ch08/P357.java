package ch08;

import java.io.FileReader;

/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : Try-With-Resource
 */
public class P357 {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("test.txt")) {
			char[] a = new char[50];
			fr.read(a);
			for(char c : a)
				System.out.print(c);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
