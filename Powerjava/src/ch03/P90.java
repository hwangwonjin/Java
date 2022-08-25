package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 황원진
 * 내용 :다중 if-else문 
 * 
 */
public class P90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오.");
		int number = sc.nextInt();
		if(number>0)
			System.out.println("양수입니다");
		else if(number==0)
			System.out.println("0입니다");
		else
		System.out.println("음수입니다");
		
		

	}

}
