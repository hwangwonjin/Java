package ch06;
/*날짜 : 2022/09/03
 *이름 : 황원진 
 *내용 : Employee 클래스 
 */
class Employee1{
	public int basesalary = 3000000;
	int getSalary() {	return basesalary;}
}

class Manager extends Employee1{
	@Override
	int getSalary() {
		return (basesalary +2000000);
	}
}

class Programmer extends Employee1{
	@Override
	int getSalary() {
		return (basesalary + 3000000);
	}
}

public class P244 {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		System.out.println(" 관리자의 월급 : "+m1.getSalary());
		
		Programmer g1 = new Programmer();
		System.out.println("프로그래머의 월급 : "+g1.getSalary());
	}
}
