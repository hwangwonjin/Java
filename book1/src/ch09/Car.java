package ch09;
/*날짜 : 2022/09/14
 *이름 : 황원진
 *내용 : 추상 클래스와 템플릿 메서드
 */
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}
