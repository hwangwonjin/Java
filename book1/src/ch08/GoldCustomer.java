package ch08;
/*날짜 : 2022/09/12
 *이름 : 황원진
 *내용 : 새로운 고객 등급 추가하기
 */
public class GoldCustomer extends Customer{

	double saleRatio;
	
	public GoldCustomer(int CustomerID, String customerName) {
		super(CustomerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	@Override
	public int CalcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
