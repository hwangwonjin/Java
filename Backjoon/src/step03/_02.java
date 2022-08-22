package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 황원진
 * 내용 : 백준 3단계 2번 문제 A + B -3
 * 
 */
public class _02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b;
		int c;
		
		for(int i = 0; i < a; i++) {
			 b = sc.nextInt();
			 c = sc.nextInt();
			
			System.out.println(b+c);
		}

	}

}
