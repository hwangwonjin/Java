package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : 입력 예외 처리
 */
public class P356 {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("ABC");
			System.out.println(num);
		}catch (Exception e) {
			System.out.println("NumverFormat 예외 발생");
		}
	}
}
