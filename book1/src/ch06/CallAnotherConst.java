package ch06;
/*
 * 날짜 : 2022/08/26
 * 이름 : 황원진
 * 내용 : this 출력하기
 * 페이지 : 172
 */
 	class Person{
 		String name;
 		int age;
 		
 		Person(){
 			this("이름없음",1);
 		}
 			
 		Person(String name, int age){
 			this.name = name;
 			this.age = age;
 		}
 		
 		Person returnItSlef() {
 			return this;
 		}
 		
 		
 	}

 	

 	public class CallAnotherConst {
 		public static void main(String[] args) {
			Person noName = new Person();
			System.out.println(noName.name);
			System.out.println(noName.age);
			
			Person p = noName.returnItSlef();
	 		System.out.println(p);
	 		System.out.println(noName);
			
		}
 		
 		
 		
 		
}
