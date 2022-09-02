package ch06;
/*날짜 : 2022/09/02
 * 이름 : 황원진
 * 내용 : 변수의 주소 값 비교하기
 * 
 */
public class CompanyTest {
	public static void main(String[] args) {
		Company mycopany1 = Company.getinstance();
		Company mycopany2 = Company.getinstance();
		System.out.println(mycopany1 == mycopany2);
	}
}
