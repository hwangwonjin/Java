package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 추상 메소드 예시
 */
abstract class Shape{
	int x,y;
	public void translate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
}

class Rectangle extends Shape{
	
	int width, hegit;
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기 메소드");
		
	}
	
}

class Circle extends Shape {

	int radius;
	
	@Override
	public void draw() {
		System.out.println("원 그리기 메소드");
	}
	
}

public class P280 {
	public static void main(String[] args) {
		//Shape s1 = new Shape(); 에러 추상 클래스로 객체를 생성할 수 없다.
		Shape s2 = new Circle();
		s2.draw();
	}
}
