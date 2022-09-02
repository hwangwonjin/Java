package ch05;
/*날짜 : 2022/09/02
 * 이름 : 황원진
 * 내용: 정적 블록
 */
public class P206 {

	static int number;
	static String s;
	static {
		number = 23;
		s= "hello world!";
	}
	
	
	public static void main(String args[]) {
		System.out.println("number : "+number);
		System.out.println("s : "+s);
	}
	
}
