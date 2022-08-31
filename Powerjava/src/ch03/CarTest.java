package ch03;
/*
 * 날짜 : 2022/08/31
 * 이름 : 황원진	
 * 내용 : 자동차 클래스 완성
 * 
 * 
 */
class Car{
	String color;
	int speed;
	int gear;
	
	public String toString() {
		return"Car [color ="+ color+", speed =" +speed+", gear ="+gear+"]";
	}
	
	void ChangeGear(int g) {       gear = g;				}
	void SpeedUp() {       speed = speed + 10;				}
	void speedDown() {       speed = speed -10;				}
	
	
}

public class CarTest {
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.ChangeGear(1);
		mycar.SpeedUp();
		System.out.println(mycar);
		
	}
}
