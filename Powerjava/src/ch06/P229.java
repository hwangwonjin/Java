package ch06;
/*날짜 : 2022/09/03
 * 이름 : 황원진
 * 내용 : 도형 예제
 */
class Shape{
	int x, y;
}

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		x = 0;
		y = 0; 
	}
	
	double getArea() {
		return 3.14 * radius * radius;
	}
	
}


public class P229 {
	public static void main(String[] args) {
	Circle obj = new Circle(10);
	System.out.println("원의 중심 : (" +obj.x+ "," +obj.y + ")");
	System.out.println("원의 면적 :"+obj.getArea());
}
}
