package ch08;
/*날짜 : 2022/09/09
 *이름 : 황원진
 *내용 : equals()메소드
 */
class Zero{

	int radius;
	public Zero(int radius)	{		this.radius = radius;}
	public boolean equals(Zero z1) {
		if(radius == z1.radius) return true;
		else return false;
		
	}
}

public class P338 {
	public static void main(String[] args) {
		Zero z2 = new Zero(10);
		Zero z3 = new Zero(10);
		if(z2.equals(z3)) System.out.println("2개의 제로는 같습니다.");
		else System.out.println("2개의 제로는 같지 않습니다.");
		
	}
}
