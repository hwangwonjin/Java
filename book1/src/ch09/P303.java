package ch09;
/*날짜 : 2022/09/14
 *이름 : 황원진
 *내용 : 테스트 프로그램 실행하기
 */
public class P303 {
	public static void main(String[] args) {
		Player player = new Player();
		player.Play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.Play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.Play(3);
	}
}
