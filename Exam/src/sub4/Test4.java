package sub4;

import java.util.Scanner;

/*날짜 : 2022/09/16
 * 이름 : 황원진
 *내용 : 예외처리 연습문제
 */
public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = {"김유신","김춘추","장보고","강감찬","이순신","정약용"};
		
		System.out.print("이름 검색 : ");
		String name = sc.next();
		
		int i = 0;
		while(!name.equals(names[i])) {
			i++;
		}
		System.out.println(name + "은 배열의 "+i+ "번에 있습니다.");
		sc.close();
	}
}