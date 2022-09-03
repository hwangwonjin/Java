package ch07;
/*날씨 : 2022/09/03
 *이름 : 황원진
 *내용 : 정적 메소드
 */
interface MyInterface1{
	static void print(String msg) {
		System.out.println(msg +": 인터페이스의 정적 메소드 호출");
	}
}


public class P295 {
	public static void main(String[] args) {
		MyInterface1.print("Java 8");
	}
}
