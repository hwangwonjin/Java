package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : Customer 클래스 구현하기
 */
public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int CustomerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	//	System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int CalcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCoustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String showCustomerInfo() {
		return customerName +"님의 등급은"+customerGrade+
				"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}
}
