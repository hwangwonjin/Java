package sub7;
/*날짜 : 2022/09/28
* 이름 : 황원진
* 내용 : 자바 총정리
*/
 interface Player{
	 public void play();
	 
 }

 class BaseBallPlayer implements Player{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("야구를 합니다.");
	}
	 
 }
 
 class FootBallPlayer implements Player{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("축구를 합니다.");
	}
	 
 }


public class Test07 {
	public static void main(String[] args) {
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
		
	}

	private static void playGame(Player p) {
		// TODO Auto-generated method stub
		p.play();
	}
}
