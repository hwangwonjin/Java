package ch10;
/*날씨 : 2022/09/16
 *이름 : 황원진
 *내용 : 인터페이스 구현 테스트
 */
public class P334 {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			
		}
		customer.order();
	}
}
