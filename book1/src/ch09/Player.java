package ch09;
/*날짜 : 2022/09/14
 *이름 : 황원진
 *내용 : Player 클래스 구현하기
 * 
 */
	abstract class PlayerLevel{
		public abstract void run();
		public abstract void jump();
		public abstract void turn();
		public abstract void showLevelMessage();
		
		final public void go(int count) {
			run();
			for(int i = 0; i<count; i++) {
				jump();
			}
			turn();
		}
		
	}





public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void Play(int count) {
		level.go(count);
	}
}
