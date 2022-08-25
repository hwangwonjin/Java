package step03;

import java.util.Scanner;
/*
 * 날짜 : 2022/08/24
 * 이름 : 황원진
 * 내용 : 백준 3단계 11번 문제 A + B -5
 * 
 */
public class _11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		
	for(int i = 1; ; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==0 && b==0) {
			break;
		}else {
			System.out.println(a+b);
		}
	}
		

	}

}
