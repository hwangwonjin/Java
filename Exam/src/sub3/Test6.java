package sub3;
/*날짜: 2022/09/02
 * 이름 : 황원진
 * 내용: 클래스 상속 연습문제
 * 
 */
class Rest{
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rest{
	
	public void getMoney() {
		System.out.println("건물주 입니다");
		payment();
	}
}


public class Test6 {
	public static void main(String[] args) {
		Landload master = new Landload();
		master.getMoney();
	}
}
