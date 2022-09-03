package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 지역 클래스
 */
class localInner{
	private int data = 30;
	
	void display() {
		final String msg = "현재의 데이터 값은";
		
		class Local{
			void printMsg() {
				System.out.println(msg + data);
			}
		}
		Local l1 = new Local();
		l1.printMsg();
	}
}

public class P306 {
	public static void main(String[] args) {
		localInner l2 = new localInner();
		l2.display();
	}
}
