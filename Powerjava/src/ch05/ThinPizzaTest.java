package ch05;
/*날짜 : 2022/09/01
 * 이름 : 황원진
 * 내용 정적변수사용하기
 * 페이지 : 201
 * 
 */
public class ThinPizzaTest {
	public static void main(String[] args) {
	ThinPizza p1 = new ThinPizza("super supreme");
	ThinPizza p2 = new ThinPizza("cheeze");
	ThinPizza p3 = new ThinPizza("pepperoni");
	int n = ThinPizza.count;
	System.out.println("지금까지 판매한 피자 개수 : "+n);
	
}
}
