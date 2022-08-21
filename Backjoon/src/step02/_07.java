package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 황원진
 * 내용 : 백준 2단계 7번 문제 주사위 세개
 * 
 */

public class _07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a, b, c;
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	
	if((a == b) && (b == c)) {
		System.out.println(10000 + a * 1000 );
	}else if(a == b ) {
		System.out.println(1000 + a * 100);
	}else if(a == c ) {
		System.out.println(1000 + a * 100);
	}else if(c == b ) {
		System.out.println(1000 + b * 100);
	}else if(a > b && a > c ) {
		System.out.println( a * 100);
	}else if( b > c ) {
		System.out.println( b * 100);
	}else {
		System.out.println( c * 100);
	}
	


	}

}
