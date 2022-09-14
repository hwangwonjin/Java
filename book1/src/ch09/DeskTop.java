package ch09;
/*날짜 :2022/09/14 
 * 이름 : 황원진
 * 내용 : 추상 클래스 상속 받기
 */
public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}

}
