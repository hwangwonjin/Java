package ch09;
/*날짜 : 2022/09/12
 *이름 : 황원진
 *내용 : 추상 클래스 구현하기
 */
public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
