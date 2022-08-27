package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 황원진
 * 내용 :성적을 학점으로 변환하는 프로그램
 * 
 */
public class P95 {

	public static void main(String[] args) {
	 int score, number;
	 char grade;
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("성적을 입력하십시오");
	 score = sc.nextInt();
	 number = score/10;

	 switch(number){
		 case 10:
		 case 9:	grade='A';   break;
		 case 8:	grade='B'; 	break;
		 case 7:	grade='C';	break;
		 case 6:	grade='D';	break;
		 default:	grade='F';	break;
		 
	 }
	 System.out.println("학점은 "+grade+" 입니다");
	}

}
