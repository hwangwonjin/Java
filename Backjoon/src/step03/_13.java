package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/28
 * 이름 : 황원진
 * 내용 : 백준 3단계 13번 더하기 사이클
 * 
 */
public class _13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a = number/10;//입력숫자의 십의자리
		int b = number%10;//일의자리
		
		for(int i = 1; ; i++) {
			int newnumber = b*10 + (a+b)%10;//새로운 숫자 만듬
			a = newnumber/10;//새로운 숫자의 십의자리
			b = newnumber%10;//일의자리
			if(number == newnumber) {
				System.out.println(i);
				break;
			}
		
		}
	
	}
}