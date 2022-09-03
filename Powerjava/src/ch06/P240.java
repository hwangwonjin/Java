package ch06;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : Shape Test 
 */
class Shape1{
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle1 extends Shape1{
	@Override
	public void draw() {
		System.out.println("circle을 그립니다");
	}
}

class Rectangle extends Shape1{
	@Override
	public void draw() {
		System.out.println("Rectangle을 그립니다");
	}
}

class Triangle extends Shape1{
	@Override
	public void draw() {
	System.out.println("Triangle을 그립니다");
	}
}

public class P240 {
	public static void main(String[] args) {
		Rectangle s = new Rectangle();
		s.draw();
	}
}
