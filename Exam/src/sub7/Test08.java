package sub7;
/* 날짜 : 2022/09/28
 * 이름 : 황원진
 * 내용 : 자바 총정리
 */
interface IRunnable{
	public void run();
}

interface IFlyable{
	public void fly();
}

class FlyingCar implements IRunnable, IFlyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Car fly");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car run");
	}
	
}
public class Test08 {
	public static void main(String[] args) {
		FlyingCar car = new FlyingCar();
		car.fly();
		car.run();
	}
}
