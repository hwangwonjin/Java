package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 황원진
 * 내용 : 짝수와 홀수 구분하기
 * 
 */
public class P81 {
	public static void main(String[] args) {
	int number;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하시오");
	number = sc.nextInt();
	
	if(number % 2 == 0) {
		System.out.println("짝수입니다");
	}else {
		System.out.println("홀수입니다");
	}
	
	
	
}
}
