package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/21
 * 이름 : 황원진
 * 내용 : 백준 2단계 4번 문제 사분면 고르기
 * 
 */
public class _04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();

	if(a > 0 && b > 0) {
		System.out.println("1");
	}else if (a < 0 && b > 0) {
		System.out.println("2");
	}
	else if (a < 0 && b < 0) {
		System.out.println("3");
	}
	else if (a >0 && b < 0) {
		System.out.println("4");
	}
	
	
	}

}
