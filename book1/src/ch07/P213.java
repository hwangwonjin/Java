package ch07;
/*날짜 : 2022/09/02
 * 이름 : 황원진
 * 내용: 객체 배열 복사하기
 * 페이지: 217까지
 */
public class P213 {
	public static void main(String[] args) {
	Book[] bookArray1 = new Book[3];
	Book[] bookArray2 = new Book[3];
	
	
	bookArray1[0] = new Book("태백산맥", "조정래");
	bookArray1[1] = new Book("데미안", "헤르만 헤세");
	bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
	System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
	
	bookArray2[0] = new Book();
	bookArray2[1] = new Book();
	bookArray2[2] = new Book();
	
	for(int i= 0; i<bookArray1.length; i++) {
	bookArray2[i].setBookName(bookArray1[i].getbookName());
	bookArray2[i].setAuthor(bookArray1[i].getauthor());
	}
	
	for(int i = 0; i<bookArray2.length; i++) {
		bookArray2[i].showbookInfo();
	}
	
	
	bookArray1[0].setBookName("나무");
	bookArray1[0].setAuthor("박완서");
	
	System.out.println("========bookArray1====");
	for(int i=0; i<bookArray1.length; i++) {
		bookArray1[i].showbookInfo();
	}
	System.out.println("===bookArray2====");
	for(int i = 0; i< bookArray2.length; i++) {
		bookArray2[i].showbookInfo();
	}
			
}
}
