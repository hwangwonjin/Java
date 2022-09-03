package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 디폴트 메소드 예제 
 */

class Circle2 implements Drawable{

	int radius;
	
	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
	
	@Override
	public void getSize() {
		System.out.println("3000X2000 해상도");
	}
}


public class P294 {
	public static void main(String[] args) {
		Drawable d = new Circle2();
		d.getSize();
		d.draw();
	}
}
