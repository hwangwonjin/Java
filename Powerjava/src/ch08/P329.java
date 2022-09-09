package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : 이클립스로 패키지 만들고 사용하기
 */
class Calculator {
	int add(int a, int b) {
		return a+b;
	}
}


public class P329 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(100, 200));
	}
}
