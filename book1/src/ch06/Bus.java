package ch06;
/*날짜: 2022/08/31
 * 이름 : 황원진
 * 내용: 버스클래스 구현하기
 * 페이지: 176
 * 
 * 
 */
public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 "+ busNumber+"번의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다.");
	}
	
}
