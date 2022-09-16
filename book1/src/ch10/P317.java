package ch10;
/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : CompleteCalc 클래스 실행하기
 */
public class P317 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.time(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		calc.desciption();
	
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}
}
