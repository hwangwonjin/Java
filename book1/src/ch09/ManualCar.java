package ch09;
/*날짜 : 2022/09/14
 *이름 : 황원진
 *내용 : 추상 메서드와 템플릿 메서드
 *페이지 : 293
 */
public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}

}
