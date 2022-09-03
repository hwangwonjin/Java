package ch06;
/*날짜 : 2022/09/03
 *이름 : 황원진 
 *내용 : instanceof 연산자 
 */
public class p255 {
	public static void print(Shape2 s) {
		if (s instanceof Rectangle1)
			System.out.println("실제 타입은 Rectangle");
		if (s instanceof Triangle1)
			System.out.println("실제 타입은 Triangle");
		if (s instanceof Circle2)
			System.out.println("실제 타입은 Circle");
	}
	
	public static void main(String[] args) {
		Rectangle1 s1 = new Rectangle1();
		Triangle1 s2 = new Triangle1();
		Circle2 s3 = new Circle2();
		
		print(s1);
		print(s2);
		print(s3);
	}
	
	
}
