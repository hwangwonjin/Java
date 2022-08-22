package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 황원진
 * 내용 : 백준 3단계 4번 문제 영수증
 * 
 */
public class _04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int a;
		int b;
		int c;
		int sum =0;
		
		
		for(int i =0; i < n; i++ ) {
			a =sc.nextInt();
			b =sc.nextInt();
			
			 c = a*b;
			 sum += c;
		}
		
		if( sum == x ) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
		
	}

}
