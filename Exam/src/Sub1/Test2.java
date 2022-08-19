package Sub1;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19	
 * 이름 : 황원진
 * 내용 : Java 기본 입출력 연습문제
 * 
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year;
		int brith;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = scan.nextInt();
		
		System.out.print("태어난 년도 입력 : ");
		brith =scan.nextInt();
		
		System.out.print("이름 입력 : ");
		name =scan.next();
		
		int age = year - brith;
		
		System.out.printf("%s님 안녕하세요. 당신은 올해 만 %d세 입니다", name, age);
		
		scan.close();
	}

}
