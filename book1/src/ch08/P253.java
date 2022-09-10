package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : 메서드 오버라이딩
 */
public class P253 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+"님이 지불해야 하는 금액은"
		+vc.CalcPrice(10000)+"원입니다.");
	}
}
