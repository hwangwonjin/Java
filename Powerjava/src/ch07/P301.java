package ch07;
/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 객체 비교하기
 */
class Rectangle3 implements Comparable{

	public int width = 0; 
	public int height = 0;
	
	@Override
	public String toString() {
			return "Rectangle [width=" +width+", height=" +height+"]";
	}
	
	public Rectangle3(int w, int h) {
		width = w;
		height = h;
		System.out.println(this);
	}
	
	public int getArea() {
		return width * height; 
	}

	@Override
	public int compareTo(Object o) {
		Rectangle3 otherRect = (Rectangle3) o;
		if(this.getArea() < otherRect.getArea())
			return -1;
		else if (this.getArea() > otherRect.getArea())
			return 1;
		else 
			return 0;
	}
}

public class P301 {
	public static void main(String[] args) {
		Rectangle3 r1 = new Rectangle3(100, 30);
		Rectangle3 r2 = new Rectangle3(200, 10);
		int result = r1.compareTo(r2);
		if(result == 1)
			System.out.println(r1 +"가 더 큽니다.");
		else if (result == 0)
			System.out.println("같습니다.");
		else
			System.out.println(r2+ "가 더 큽니다.");
	}
}
