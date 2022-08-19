package Sub1;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19	
 * 이름 : 황원진
 * 내용 : Java 자료형 연습문제
 * 
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		int i = score;
		char grade;
		
		System.out.println("입력한 점수는 "+score+"입니다");
		
		if(i > 90) {
			grade = 'A';
		}else if (i <91) {
			grade = 'B';
		}else if (i<80) {
			grade = 'C';
		}else if(i<70) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("등급은 %c입니다.", grade);
		
		
		
		
		
		
	
	}
}
