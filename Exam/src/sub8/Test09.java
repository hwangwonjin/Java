package sub8;

import java.io.File;
import java.io.FileWriter;

/*날짜 : 2022/09/29
 *이름 : 황원진 
 *내용 : 자바 총정리
 */
public class Test09 {
	public static void main(String[] args) {
		String path = "C:\\Users\\황원진\\Desktop\\Gugudan.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x = 2; x <= 9; x++) {
				System.out.printf(x +"단");
				
				System.out.println();
				
				for(int y = 1; y <= 9; y++) {
					int z = x * y;
					System.out.println(x+"x"+y+"="+z);
				}
			}
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("구구단 생성 완료");
	}
}
