package ch07;

import java.util.ArrayList;

/*날짜: 2022/09/02
 * 이름: 황원진
 * 내용:ArrayList 클래스 사용하기
 */
public class P224 {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		
	library.add(new Book("태백산맥", "조정래"));
	library.add(new Book("데미안", "헤르만 헤세"));
	library.add(new Book("어떻게 살 것인가", "유시민"));
	library.add(new Book("토지", "박경리"));
	library.add(new Book("어린왕자", "생택쥐페리"));
	
	for(int i = 0; i< library.size(); i++) {
		Book book = library.get(i);
		book.showbookInfo();
	}
	System.out.println();
	
	System.out.println("====향상된 for문 사용=====");
	for(Book book : library) {
		book.showbookInfo();
	}
	}
}
