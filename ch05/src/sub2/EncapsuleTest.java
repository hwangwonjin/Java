package sub2;
/*
 * 날짜 : 2022/08/25
 * 이름 : 황원진
 * 내용 : Java 캡슐화 실습하기
 * 
 *캡슐화
 *캡슐화는 객체의 속성을 외부에 참조하지 못하도록 객체의 정보를 은닉하는 속성
 *클랙스의 속성은 반드시 private 선언을 통해 캡슐화
 *은닉된 정보의 안전한 외부 참조를 위해 Getter, Setter를 제공
 *
 *
 *
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		//객체생성
		
		car sonata= new car("쏘나타", "흰색", 10);
		sonata.setColor("은색");
		sonata.speedup(80);
		sonata.speedDown(40);
		sonata.show();
		
		//Account 객체생성
		
		Account kb = new Account("국민은행", "101-12-1111", " 김유신", 1000);
		
	
		kb.deposit(50000);
		kb.whithdraw(7000);
		kb.show();
		
		Account wr = new Account ("우리은행", "101-12-2012", "김춘추", 10000);
		wr.deposit(75000);
		wr.whithdraw(5000);
		wr.show();
		
		
		
		
		
		
		
		
		
	}
}
