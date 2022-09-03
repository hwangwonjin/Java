package ch07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/*날짜 : 2022/09/03
 *이름 : 황원진
 *내용 : 타이머 이벤트 처리
 */
class MyClass implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("beep");
		
	}
}

public class P303 {
	public static void main(String[] args) {
		
		ActionListener listener = new MyClass();
		Timer t = new Timer(1000,listener);
		t.start();
		for(int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
		}
		
	}
}
