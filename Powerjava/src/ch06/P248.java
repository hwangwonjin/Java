package ch06;
/*날짜 : 2022/09/03
 *이름 : 황원진 
 *내용 : shape Test
 */
class Shape2{
	protected int x,y;
	public void draw() {	System.out.println("Shape Draw");	}
}

class Rectangle1 extends Shape2{
	protected int width, height;
	public void draw() {	System.out.println("Rectangle Draw");}
}

class Triangle1 extends Shape2{
	private int base, height;
	public void draw() {System.out.println("Triangle Draw");}
}

class Circle2 extends Shape2{
	private int radius;
	public void draw() {System.out.println("Circle Draw");}
}

public class P248 {
	public static void main(String[] args) {
		Shape2 s = new Rectangle1();
		Rectangle1 r = new Rectangle1();
		
		s.x = 0;
		s.y = 0;
		
		r.height = 180;
		r.width = 70;
		
		System.out.print("x : "+ s.x +"\ny : "+ s.y + "\nheight : "+r.height+ "\nwidth :" +r.width);
	}
}
