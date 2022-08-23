package ch02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 황원진
 * 내용 : 사용자로부터 이름과 나이를 받는 프로그램
 * 
 */
public class P67 {

	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");
		name = sc.nextLine();
		
		System.out.println("나이를 입력하시오");
		age = sc.nextInt();
		
		System.out.println(name+"님 안녕하세요!"+(age)+"살 이시네요");
		

	}

}
