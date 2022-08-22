package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 황원진
 * 내용 : 백준 3단계 6번 문제 A + B -7
 * 
 */
public class _06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b;
		int c;
		int sum;
		
		
		for(int i = 1; i <= a; i++) {
			 b =sc.nextInt();
			 c =sc.nextInt();
			 sum = b + c;
		System.out.println("Case #"+i+": " +sum);
			
		}

	}

}
