package ch10;
/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : 순서대로 배분하기
 */
 class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}

 class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담순서를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 업무가 없거나 대기가 가장 적은 상담원에세 할당합니다.");
	}
	 
 }
 
class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
	System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.");
	}
	
}
 
 