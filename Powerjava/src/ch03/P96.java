package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/27
 * 이름 : 황원진
 * 내용 :피자의 종류에 따른 가격 출력
 * 
 */
public class P96 {

	public static void main(String[] args) {
		int price;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("피자의 종류를 결정하시오.");
		String model = sc.next();
		price = 0;
		
		switch(model) {
		case "콤비네이션" : 	
		case "슈퍼슈림프" :		price = 20000; 	break;
		case "포테이토" : 		price = 15000;	break;
		case "치즈" : 			price = 13000;	break;
		default:				price = 0;		break;
		
		}
		System.out.println("피자 "+model+"의 가격은 "+price+"원입니다.");
		
	}

}
