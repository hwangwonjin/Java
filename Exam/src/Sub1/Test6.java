package Sub1;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19	
 * 이름 : 황원진
 * 내용 : Java 삼항연산자 연습문제
 * 
 */
public class Test6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("x값 입력 : ");
		 int x = sc.nextInt();
		 
		 System.out.print("y값 입력 : ");
		 int y = sc.nextInt();

		  Object result = x > y ? "x가 더 큽니다" : "y가 더 큽니다";//string사용
			 System.out.println(result);
	}

}
