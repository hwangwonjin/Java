package sub2;
/*날짜 : 2022/09/01
 * 이름 : 황원진
 * 내용: 인터페이스 실습하기
 * 
 * 인터페이스(Interface)
 * 클래스간 공통의 표준 규격을 통해 클래스 구조를 설계하는 문법
 * 인터페이스를 활용해서 객체간 결합도를 완화하는 효과(다형성)
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {
	
		
		//인터페이스 구현 클래스 객체 생성
		Car sonata = new Sedan("쏘나타","흰색",0);
		sonata.speedUP(100);
		sonata.speedDown(10);
		sonata.show();
		
		Car bongo = new Truck("봉고","파란색",0);
		bongo.speedUP(90);
		bongo.speedDown(30);
		bongo.show();
				
		
		//인터페이스 결합도 완화
		
		Bulb bulb = new Bulb();
		int num = 10;
		Socket socket = new Cable(bulb, num);
		
		
		socket.swichon();
		socket.swichoff();
		
		
		//인터페이스 다중 상속 효과
		
		Tv smartTv = new Tv();
				
		smartTv.poweron();
		smartTv.booting();
		smartTv.browser();
		smartTv.access();
		smartTv.poweroff();
		
		
		
		
}
}


class Tv extends computer implements Internet{
	
	
	public void poweron() {
		System.out.println("전원 켬...");
	}
	
	public void poweroff() {
		System.out.println("전원 끔...");
	}

	@Override
	public void access() {
	System.out.println("인터넷 접속...");
		
	}
	
}

class computer {
	
	public void booting() {
		System.out.println("시스템 부팅....");
	}
	
	public void browser() {
		System.out.println("브라우저 실행....");
	}
}

interface Internet {
	
	public void access();
	
}



