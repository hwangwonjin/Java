package ch10;
/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : 인터페이스 구현
 */
public class P339 {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}
