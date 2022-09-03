package ch06;
/*날짜 : 2022/09/03
 * 이름 : 황원진
 * 내용 : 상속과 생성자
 */
class Base {
	public Base() {
		System.out.println("Base() 생성자");
	}
}

class Derived extends Base{
	public Derived() {
		super();
		System.out.println("Derived() 생성자");
	}
}


public class P234 {
	public static void main(String[] args) {
		Derived r = new Derived();
	}
}
