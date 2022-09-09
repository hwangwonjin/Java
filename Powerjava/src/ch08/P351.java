package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : 예외 처리
 */
public class P351 {
	public static void main(String[] args) {
		try{
			int result = 10/0;
		}catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다. ");
		}
		System.out.println("프로그램은 계속 진행합니다.");
	}
}