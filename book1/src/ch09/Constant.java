package ch09;
/*날짜 : 2022/09/15
 *이름 : 황원진
 *내용 : final 실습하기
 */
public class Constant {
	int num = 10;
	final int Num = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		//cons.Num = 200;
		
		System.out.println(cons.num);
		System.out.println(cons.Num);
	}
}
