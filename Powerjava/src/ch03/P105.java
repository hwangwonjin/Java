package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 황원진
 * 내용 : 정확한 입력받기
 * 
 */
public class P105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.println("올바른 월을 입력하시오 [1-12] ");
			month = sc.nextInt();
		
		}while(month<1||month>12);
		System.out.println("사용자가 입력한 월은 "+month+"입니다.");
		

	}

}
