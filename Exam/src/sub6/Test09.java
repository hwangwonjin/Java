package sub6;
/*날짜 : 2022/09/27
 *이름 : 황원진
 *내용 : 자바 총정리 실습
 */
public class Test09 {
	public static void main(String[] args) {
		pyramid(3);
		pyramid(5);
		pyramid(7);
	}

	private static void pyramid(int n) {

		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k < i*2; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
