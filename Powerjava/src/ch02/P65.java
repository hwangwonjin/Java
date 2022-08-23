package ch02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 황원진
 * 내용 : 사용자로부터 입력받은 두 수를 받아서 더하기
 */
public class P65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		x= sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요 : ");
		y= sc.nextInt();
		
		sum = x+y;
		System.out.println(sum);
		
		

	}

}
