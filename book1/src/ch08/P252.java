package ch08;
/*날짜 : 2022/09/10
 *이름 : 황원진
 *내용 : calcPrice() 테스트하기
 * 
 */
public class P252 {
	public static void main(String[] args) {
	 Customer customerLee = new Customer(10010,"이순신");
	 customerLee.bonusPoint = 1000;
	 
	 VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
	 customerKim.bonusPoint = 10000;
	 
	 int price = 10000;
	 System.out.println(customerLee.getCustomerName()+"님이 지불해야하는 금액은"
	 +customerLee.CalcPrice(price)+"원입니다.");
	 System.out.println(customerKim.getCustomerName()+"님이 지불해야 하는 금액은"
	 +customerKim.CalcPrice(price)+"입니다");
	}
}
