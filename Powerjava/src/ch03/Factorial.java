package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 황원진
 * 내용 :팩토리얼 계산하기
 * 페이지 : 100
 */
public class Factorial {

	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.print("정수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (int i =1; i <= n; i++) 
			fact = fact * i;
			
			System.out.printf("%d!는 %d입니다.\n", n, fact);
		

	}

}
