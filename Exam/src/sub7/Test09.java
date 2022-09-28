package sub7;
/* 날짜 : 2022/09/28
 * 이름 : 황원진
 * 내용 : 자바 총정리
 */
interface Tv{
	public void turnOn();
	public void turnOff();
}



public class Test09 {
	public static void main(String[] args) {
		
		Tv tv = new Tv() {
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("tv를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("tv를 끕니다.");
			}
		};
		
		tv.turnOn();
		tv.turnOff();
	}
}
