package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 황원진
 * 내용 :성적 처리 예제
 *   
 */
public class P91 {

	public static void main(String[] args) {
		int gread;
		
		Scanner sc = new Scanner(System.in);
		gread = sc.nextInt();
		
		if(gread>=90) {
			System.out.println("학점은 A입니다");
		}else if(gread>=80){
			System.out.println("학점은 B입니다");
		}else if(gread>=70) {
			System.out.println("학점은 C입니다");
		}else if(gread>=60) {
			System.out.println("학점은 D입니다");
		}else {
			System.out.println("학점은 F입니다");
		}
		

	}

}
