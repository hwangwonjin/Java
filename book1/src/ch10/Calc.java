package ch10;
/*날짜 :2022/09/16 
 *이름 : 황원진
 *내용 : Calc 인터페이스 만들기
 *페이지:  315
 */
public interface Calc {
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int time(int num1, int num2);
	int divide(int num1, int num2);
	
	default void desciption() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	}
}
