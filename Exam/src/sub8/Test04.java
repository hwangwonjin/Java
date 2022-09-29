package sub8;
/*날짜 : 2022/09/29
 *이름 : 황원진 
 *내용 : 자바 총정리
 */
public class Test04 {
	public static void main(String[] args) {
		
		int i = 5;
		char c = 'A';
		float f = 3.14f;
		double d = 31.4;
		boolean b = true;
		String s = "Hello";
		
		printargInfo(i);
		printargInfo(c);
		printargInfo(f);
		printargInfo(d);
		printargInfo(b);
		printargInfo(s);
	}

	public static <T> void printargInfo(T arg) {
		System.out.println("타입 : " + arg.getClass());
		System.out.println("값 : " + arg.toString());
		
		
	}
}
