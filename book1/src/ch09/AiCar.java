package ch09;
/*날짜 : 2022/09/14
 *이름 : 황원진
 *내용 : 추상 클래스와 메서드
 *페이지 : 292
 */
public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}

}
