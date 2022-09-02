package ch05;
/*날짜 : 2022/09/02
 * 이름:황원진
 * 내용:정적 메소드 사용하기
 * 
 */
public class Test {
	public static int cube(int x) {
		int result = x*x*x;
		return result;
	}
	
	public static void main(String atgs[]) {
		System.out.println("10*10*10은 "+cube(10));
	}
	
}
