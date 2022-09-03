package ch06;
/*날짜 : 2022/09/03
 * 이름 : 황원진
 * 내용: Animal 클래스와 Dog 클래스 만들어보기
 * 페이지 : 243
 */
class Animal{
	void speak() {	System.out.println("Animal 클래스의 sound()");}	
	}


 class Dog extends Animal{
	 void speak() {
		System.out.println("멍멍");
	}
 }
class Cat extends Animal{
	void speak() {System.out.println("야옹");}
}
	 
public class DynamicCallTest{
	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.speak();
		a2.speak();
	}
}


