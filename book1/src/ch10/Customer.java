package ch10;
/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : 여러 인터페이스 구현
 */
	interface Buy{
		void buy();
		
		default void order() {
			System.out.println("구매주문");
		}
	}
	
	
	interface Sell{
		void sell();
		
		default void order() {
			System.out.println("판매주문");
		}
	}

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("구매하기");
	}

	@Override
	public void buy() {
		System.out.println("판매하기");
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}

}
