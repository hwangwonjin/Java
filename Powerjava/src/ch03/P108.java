package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 황원진
 * 내용 : 점수 평균 구하기
 * 
 */
public class P108 {

	public static void main(String[] args) {
		int total =0, count = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("점수를 입력하시오");
			int grade = sc.nextInt();
			if(grade<0) 		break;
			
			total += grade;
			count++;
		}
		System.out.println("평균은 "+total/count);
	}

}
