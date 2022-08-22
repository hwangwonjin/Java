package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22
 * 이름 : 황원진
 * 내용 : 백준 3단계 8번 문제 별 찍기-1
 * 
 */
public class _08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int a = 1; a <= n; a++) {
			for(int i = 1; i <= a; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
