package ch08;
/*날짜 : 2022/09/11
 *이름 : 황원진
 *내용 : 가상 메서드
 */


public class P254 {
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		P254 p1 = new P254();
		p1.aaa();
		P254 p2 = new P254();
		p2.aaa();
	}
}
