package sub4;
/*날짜 : 2022/09/08
 *이름 : 황원진
 *내용 : 수학 클래스 실습하기
 * 
 */
public class MathTeat {
	public static void main(String[] args) {
		
		
		//수학 메서드
		//Math m = new Math(); 불가
		
		System.out.println("절댓값 : "+Math.abs(-5));
		System.out.println("제곱근 : "+Math.sqrt(9));
		System.out.println("올림값 : "+Math.ceil(1.2));
		System.out.println("올림값 : "+Math.ceil(1.8));
		System.out.println("내림값 : "+Math.floor(1.2));
		System.out.println("내림값 : "+Math.floor(1.8));
		System.out.println("반올림 : "+Math.round(1.2));
		System.out.println("반올림 : "+Math.round(1.8));
		
		//random
		double num1 = Math.random();
		System.out.println("num 1 : "+num1);// 0에서 1사이의 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : "+num2);//0부터 10사이의 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3);//1~10 사이의 정수
		
		int rand = (int)Math.ceil(Math.random()*45);//1~45 사이 정수
		System.out.println("rand : "+rand);
		
	}
}
