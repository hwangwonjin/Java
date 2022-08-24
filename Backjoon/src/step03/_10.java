package step03;

import java.util.Scanner;
/*
 * 날짜 : 2022/08/24
 * 이름 : 황원진
 * 내용 : 백준 3단계 10번 문제 A + B -7
 * 
 */
public class _10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int a =1; a<= n; a++) {
			int b = sc.nextInt();
			if(b<x) {
				System.out.print(b+" ");
			}
			
			
		}
		
		
		

	}

}
