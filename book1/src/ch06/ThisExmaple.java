package ch06;
/*
 * 날짜 : 2022/08/26
 * 이름 : 황원진
 * 내용 : this 출력하기
 * 페이지 : 170
 */
 class BirthDay {

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
		}
	}


public class ThisExmaple {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		
	}
	
}

	
	

