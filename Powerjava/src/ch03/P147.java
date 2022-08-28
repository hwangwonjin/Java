package ch03;

/*
 * 날짜 : 2022/08/28
 * 이름 : 황원진
 * 내용 : CircleTest
 * 
 */
public class P147 {

	public static void main(String[] args) {
		Circle obj;
		obj = new Circle();
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.getArea();
		System.out.println("원의 면적 : "+area);
	}

}
