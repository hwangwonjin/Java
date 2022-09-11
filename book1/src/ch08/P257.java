package ch08;
/*날짜 : 2022/09/11
 *이름 : 황원진
 *내용 : 2022/09/11
 */
public class P257 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010,"이순신");
		System.out.println(customerLee.getCustomerName()+
				"님이 지불해야 하는 금액은"+customerLee.CalcPrice(price)+"원 입니다.");

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName()
				+"님이 지불해야 하는 금액은"+customerKim.CalcPrice(price)+"원 입니다.");
	
		Customer vc = new VIPCustomer(10030, "나몰라",20000);
		 System.out.println(vc.getCustomerName()+
				 "님이 지불해야 하는 금액은"+vc.CalcPrice(10000)+"원 입니다.");
	}
}
