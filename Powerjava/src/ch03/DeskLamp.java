package ch03;

/*
 * 날짜 : 2022/08/28
 * 이름 : 황원진
 * 내용 : DeskLamp 클래스 작성하고  객체 생성해보기
 * 페이지 :150
 */
public class DeskLamp {

	private boolean isOn;
	
	public void TureOn ()	{ isOn = true;}
	public void TureOff ()	{ isOn = false;}
	public String toString() {
		return "현재 상태는 "+ (isOn == true? "켜짐" : "꺼짐");
	}
}
