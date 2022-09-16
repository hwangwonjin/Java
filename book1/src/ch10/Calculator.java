package ch10;
/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : 인터페이스 구현하기
 *페이지 : 316
 */
public abstract class Calculator implements Calc{
	
	@Override
		public int add(int num1, int num2) {
			return num1 + num2;
		}
	@Override
		public int substract(int num1, int num2) {
			return num1 - num2;
		}
}
