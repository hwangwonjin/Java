package ch03;

/*
 * 날짜 : 2022/08/28
 * 이름 : 황원진
 * 내용 : Account
 * 페이지 : 166
 */
 class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	public String getName() {		return name;}
	public void setName(String name) {		this.name=name;}
	public int getbalance() {		return balance;}
	public void setbalance(int balance) {	this.balance=balance;}
	
}

	public class AccountTest {
		public static void main(String[] args) {
		
			Account obj = new Account();
			obj.setName("Tom");
			obj.setbalance(100000);
			System.out.println("이름은 "+obj.getName()+" 통장 잔고는 "+obj.getbalance()+"입니다.");
		}
	}

