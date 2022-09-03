package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 * 내용 : 다중 상속 예제
 */
class Shape1{
	protected int x,y;
}

interface Drawable{
	void draw();
	public default void getSize() {
		System.out.println("1024X768 해상도");
	}
}

class Circle1 extends Shape1 implements Drawable{

	int radius;	
	
	@Override
	public void draw() {
		System.out.println("Circle Draw at ("+x+","+y+")");
		
	}
	
}
public class P292 {
	public static void main(String[] args) {
		Drawable d1 = new Circle1();
		d1.draw();
	}
}
