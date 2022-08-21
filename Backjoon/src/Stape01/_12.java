package Stape01;
/*
 * 날짜 : 2022/08/20
 * 이름 : 황원진
 * 내용 : 백준 1단계 12 문제 곱셈
 * 
 */
import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int abc = sc.nextInt();
		int def = sc.nextInt();
		
		System.out.println(abc*(def%10));
		System.out.println(abc*((def/10)%10));
		System.out.println(abc*(def/100));
		System.out.println(abc*def);
		
	
		
		
	}

}
