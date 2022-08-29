package sub4;
/*
 * 날짜 : 2022/08/29
 * 이름 : 황원진
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습
 * 
 *
 */
class Adder{
	private static Adder instace = new Adder();
	public static Adder getInstace() {
		return instace;
	}
	private Adder() {}
	private Adder(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;	
	}
	
	public static void add(Adder a2) {
		a2.x += 10;
	}
	
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}

	public class AdderTest{
		public static void main(String[] args) {
			
		int[] arr = new int[2];
		arr[0] =  10;
		arr[1] =  20;
		
		Adder a1 = Adder.getInstace();
		
		a1.add(1, 2);
		a1.show();
		
		
		
		}
		
		

	} 

