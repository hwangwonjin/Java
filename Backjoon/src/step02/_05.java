package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 황원진
 * 내용 : 백준 2단계 5번 문제 알람시계
 * 
 */
public class _05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a < 0 || a > 23) || (b < 0 || b > 59)) {
			System.out.println("틀린 시간입니다");
		}else if(b >= 45) {
			System.out.print(a + " ");
			System.out.print(b-45);
		}else {
			if(a == 0 ) {
				 a = 23;
				System.out.print(a + " ");
			}else {
				System.out.print(a-1 +" ");
			}
			System.out.print(b+15);
		}
		
	}

}
