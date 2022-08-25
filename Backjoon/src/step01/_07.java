package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 황원진
 * 내용 : 백준 1단계 7 문제 사칙연산
 * 
 */
public class _07 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	//System.out.printf(" %d %d %d %d %d ", a+b, a-b, a*b, a/b, a%b ); 숫자 배열처럼 나오게 만들기
	System.out.println(a+b);	
	System.out.println(a-b);	
	System.out.println(a*b);	
	System.out.println(a/b);	
	System.out.println(a%b);	
		
	
	
	
	}
}
