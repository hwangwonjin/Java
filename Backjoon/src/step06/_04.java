package step06;

import java.util.Scanner;

/*날짜 : 2022/10/03
 *이름 : 황원진
 *내용 : 백준 6단계 4번 문자열반복
 * 
 */

public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String a =sc.next();
			
			for(int j = 0; j < a.length(); j++) {
				for(int k = 0; k < r; k++) {
					System.out.print(a.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}
