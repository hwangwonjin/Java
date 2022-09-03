package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 인터페이스를 이용한 다중 상속
 */
interface Drivable {void drive();}
interface Flyable {void fly();}


public class P291 implements Drivable, Flyable{


	@Override
	public void fly() {
		System.out.println("I'm driving");
	}

	@Override
	public void drive() {
		System.out.println("I'm flying");
		
	}
	
	public static void main(String[] args) {
		P291 f1 = new P291();
		f1.drive();
		f1.fly();
	}
}
