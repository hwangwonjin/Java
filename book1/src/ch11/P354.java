package ch11;
/*날짜 : 2022/09/16
 *이름 : 황원진
 *내용 : Object 클래스의 toString() 메서드 사용하기
 */
class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
		public String toString() {
			return bookTitle + ","+bookNumber;
		}
}


public class P354 {
	public static void main(String[] args) {
		Book book1 = new Book(200,"개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
