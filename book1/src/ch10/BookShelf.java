package ch10;

import java.util.ArrayList;

/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : Shelf 클래스 만들기
 *페이지 : 341
 */
 class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
 
 interface Queue{
	 void enQueue(String title);
	 String deQueue();
	 int getSize();
 }
 

 public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	 
 }