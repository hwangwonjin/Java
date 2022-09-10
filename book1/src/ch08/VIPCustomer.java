package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : VIPCustomer 클래스 구현하기
 */
public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println();
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
		public int CalcPrice(int price) {
		bonusPoint += price * bonusRatio;
			return price - (int)(price*saleRatio);
		}
}
