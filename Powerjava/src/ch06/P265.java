package ch06;
/*날짜 : 2022/09/03
 *이름 : 황원진 
 *내용 : has-a 관계 예제
 */
class Date{
	private int  year, month, date;
	
	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Date[year ="+year+", month="+month+", date"+date+"]"; 
	}
}

class Employee2 {
	private String name;
	private Date birthDate;
	
	public Employee2(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee2[name=" +name+", birthDate=" +birthDate+"]";
	}
	
}

public class P265 {
	public static void main(String[] args) {
		Date birth = new Date(1999,1,1);
		Employee2 employee = new Employee2("홍길동",birth);
		System.out.println(employee);
	}
}
