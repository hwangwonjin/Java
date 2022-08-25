package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 황원진
 * 내용 :가위,바위,보 게임
 * 
 */
public class P92 {
	final int sissor = 0;
	final int rock = 1;
	final int paper = 2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0), 바위(1),보(2): ");
		int user =sc.nextInt();
		
		int computer =(int) (Math.random()*3);
		if(user == computer) {
			System.out.println("비겼습니다");
		}else if(user==(computer+1)%3) {
			System.out.println("인간:"+user+"컴퓨터:"+computer+"인간승리");
		}else {
			System.out.println("컴퓨터가이겼습니다");
		}
		
		
		
		
		
		

	}

}
