package ch08;

import java.util.Random;

/*날짜 : 2022/09/09
 *이름: 황원진
 *내용 : Math, Random 클래스
 */
public class P348 {
	public static void main(String[] args) {
		double x = Math.PI;
		System.out.println(Math.sin(x));
		System.out.println(Math.random());
		
		
		
		Random random = new Random();
		for(int i = 0; i<10; i++)
			System.out.print(random.nextInt(100)+",");
		
		
	}
}
