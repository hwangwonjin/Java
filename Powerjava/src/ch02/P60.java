package ch02;
/*
 * 날짜 : 2022/08/23
 * 이름 : 황원진
 * 내용 : 1광년 거리 계산하기
 * 
 */
public class P60 {

	public static void main(String[] args) {
		final double Light_speed= 3e5;
		double distance;
		
		distance = Light_speed * 365 * 24 * 60 * 60;
		System.out.println("빛이 일년 동안 가는 거리 : " +distance+"km입니다");

	}

}
