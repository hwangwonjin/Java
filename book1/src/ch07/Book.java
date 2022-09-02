package ch07;
/*날짜 : 2022/09/02
 * 이름 : 황원진
 * 내용 : 객체 배열 만들기
 * 페이지 : 207
 */
public class Book {

	private String bookName;
	private String author;
	
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author= author;
	}
	public String getbookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	public String getauthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showbookInfo() {
		System.out.println(bookName+ ","+author);
	}



}
