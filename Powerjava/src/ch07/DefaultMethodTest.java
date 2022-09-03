package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 디폴트 메소드
 */
interface MyInterface{
	public void myMethod1();
	
	default void myMethod2() {
		System.out.println("myMethod2()");
	}
}

public class DefaultMethodTest implements MyInterface{

	@Override
	public void myMethod1() {
		System.out.println("myMethod1()");
	}

	
	public static void main(String[] args) {
		MyInterface m1 = new DefaultMethodTest();
		m1.myMethod1();
		m1.myMethod2();
	}
}

 


