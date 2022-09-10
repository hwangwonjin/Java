package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : 상속 클래스 테스트
 */
public class P239 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(1000, "이순신");
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		VIPCustomer customerKim = new VIPCustomer(1000, null, 0);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
