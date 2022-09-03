package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 원격 제어 인터페이스
 */
interface RemoteControl{
	void turnOn();
	void turnOff();
	public default void printBrand() {
		System.out.println("Remote Control 가능 TV");
	}
		
}

class Television implements RemoteControl{
	boolean on;
	public void turnOn() {
		on = true;
		System.out.println("TV가 켜졌습니다.");
	}
	
	public void turnOff() {
		System.out.println("TV가 꺼졌습니다.");
	}
	
	@Override
	public void printBrand() {
		System.out.println("Power Java TV입니다.");
	}
}

public class P288 {
	public static void main(String[] args) {
		RemoteControl r1 = new Television();
		r1.turnOn();
		r1.turnOff();
		r1.printBrand();
	}
}
