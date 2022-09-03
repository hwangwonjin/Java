package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 자율 주행 자동차
 */

 interface OperateCar{
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}

 class AutoCar implements OperateCar{

	@Override
	public void start() {
		System.out.println("자동차가 출발합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
		
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 "+speed+"km/h로 바꿉니다.");
		
	}

	@Override
	public void turn(int degree) {
		System.out.println("자동차가 방향을 "+degree+"도 만큼 바꿉니다.");
		
	}
	
}
 
public class P299{
	public static void main(String[] args) {
		OperateCar o1 = new AutoCar();
		o1.start();
		o1.setSpeed(100);
		o1.turn(15);
		o1.stop();
	}
}

