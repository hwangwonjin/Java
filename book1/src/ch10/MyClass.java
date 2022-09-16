package ch10;
/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : 인터페이스 상속하기
 *페이지 : 337
 */
	interface X{
		void x();
	}

	interface Y{
		void y();
	}
	
	interface MyInterface extends X,Y{
		void myMethod();
	}

public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
	
	
}
