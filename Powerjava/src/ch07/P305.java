package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 내부 클래스
 */
class OuterClass{
	private int value = 10;
	
	class InnerClass {
		public void myMethod() {
			System.out.println("외부 클래스의 private 변수 값 : "+value);
		}
	}
	
	OuterClass(){
		InnerClass i1 = new InnerClass();
		i1.myMethod();
	}
	
}

public class P305 {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
	}
}
