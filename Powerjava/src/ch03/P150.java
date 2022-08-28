package ch03;

/*
 * 날짜 : 2022/08/28
 * 이름 : 황원진
 * 내용 : DeskLamp 클래스 작성하고 객체 생성해보기
 * 
 */
public class P150 {

	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
		
		myLamp.TureOn();
		System.out.println(myLamp);
		myLamp.TureOff();
		System.out.println(myLamp);

	}

}
