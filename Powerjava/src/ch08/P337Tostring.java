package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : ToString() 메소드
 */
class Circle1 {
	int radius;
	public Circle1(int radius) {		this.radius = radius;}
	public String toString() {return"Circle(r="+radius+")";}
}

public class P337Tostring {
	public static void main(String[] args) {
		Circle1 c1 = new Circle1(10);
		System.out.println(c1);
	}
}
