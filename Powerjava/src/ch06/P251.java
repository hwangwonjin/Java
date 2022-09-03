package ch06;
/*날짜 : 2022/09/03
 *이름 : 황원진 
 *내용 : 업캐스팅 & 다운캐스팅 
 */
class Parent{
	void print() {	System.out.println("Parent 메소드 호출");}
}

class Child extends Parent{
	@Override
	void print() {
		System.out.println("Child 메소드 호출");
	}
}


public class P251 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.print();
		
		
		Child c = (Child)p;
		c.print();
	}
}
