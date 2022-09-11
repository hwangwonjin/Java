package ch08;
/*날짜 : 2022/09/11
 *이름 : 황원진
 *내용 : 다형성
 */
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	
	}
}


class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}
public class P260 {
	public static void main(String[] args) {
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Human();
		
		a1.move();
		a2.move();
		a3.move();
		
	}
	
	public void move(Animal animal) {
		animal.move();
	}
}
