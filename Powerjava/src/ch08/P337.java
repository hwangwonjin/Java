package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : getClass 메소드
 */
class Circle{}

public class P337 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("c1 is of type "+c1.getClass().getName());
		System.out.println("c1의 해쉬코드 : "+c1.hashCode());
	}
}
