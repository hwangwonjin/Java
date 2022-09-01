package ch05;
/*날짜 : 2022/09/01
 * 이름: 황원진
 * 내용 : 정적 메소드 사용하기
 * 페이지: 203
 */
public class MyMath {
	public static int abs(int x) {   return x>0?x:-x;	}
	public static int power(int base, int exponent) {
		int result = 1;
		for(int i = 1; i<= exponent;i++)
			result *= base;
			return result;
	}
}
