package ch05;
/*날짜 : 2022/09/01
 * 이름 : 황원진
 * 내용 : 정적변수 사용하기
 * 페이지 : 201
 */
public class ThinPizza {
	private String Topping;
	private int radius;
	static final double PI = 3.141592;
	static int count;
	
	public ThinPizza(String topping) {
		this.Topping = topping;
		count++;
	}
}
