package ch09;
/*날짜 : 2022/09/14
 *이름 : 황원진
 *내용 : 추상 메서드와 템플릿 메서드 
 *
 */
public class P294 {
	public static void main(String[] args) {
		System.out.println("====자율 주행하는 자동차======");
		Car mycar = new AiCar();
		mycar.run();
		
		System.out.println("=====사람이 운전하는 자동차====");
		Car hiscar = new ManualCar();
		hiscar.run();
	}
}
