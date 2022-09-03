package ch06;
/*날씨 : 2022/09/03
 *이름 : 황원진 
 *내용 : 배열 호출
 */
public class P252 {
	public static void main(String[] args) {
		Shape2[] arrayOfShapes = new Shape2[3];
		
		arrayOfShapes[0] = new Rectangle1();
		arrayOfShapes[1] = new Triangle1();
		arrayOfShapes[2] = new Circle2();
		
		for(int i = 0; i <arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}
}
