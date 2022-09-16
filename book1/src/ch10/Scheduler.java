package ch10;
/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : Scheduler 인터페이스 정의하기
 *페이지 : 322
 */
public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
