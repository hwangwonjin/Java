package ch02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 황원진
 * 내용 : 형변환 실습하기
 * 
 */
public class P70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("초를 입력하십시오");
		int time = sc.nextInt();
		int sec = (time%60);
		int min = (time/60);
		
		System.out.println(time+ "초는"+ min +"분 " + sec + "초 입니다");
	}

}
