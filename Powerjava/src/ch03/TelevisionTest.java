package ch03;

/*
 * 날짜 : 2022/08/28
 * 이름 : 황원진
 * 내용 : Television클래스 작성하고 객체 생성해보기
 * 
 */
class Television {
	private int channal;
	private int volume;
	private boolean onOff;
	
	Television(int c, int v, boolean o){
		channal = c;
		volume = v;
		onOff = o;
		
	}
	
	void print() {
		System.out.println("채널은 "+channal+"이고 볼륨은 "+volume+"입니다");
		
	}

}
public class TelevisionTest{
	public static void main(String[] args) {
		Television myTv= new Television(7,10,true);
		myTv.print();
		
		Television yourTv = new Television(5,12,true);
		yourTv.print();
		
		
		
	}
	
}

