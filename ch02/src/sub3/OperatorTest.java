package sub3;
/*
 * 날짜 : 2022/08/16	
 * 이름 : 황원진
 * 내용 : Java 연산자 실습하기
 * 
 */
public class OperatorTest {
	public static void main(String[] args) {
	//산술연산자
	int num1 = 1; 	
	int num2 = 2; 	
	int num3 = 3; 	
	int num4 = 4; 	

	int r1 = num1 + num2;
	int r2 = num1 - num2;
	int r3 = num2 * num3;
	int r4 = num4 / num2;
	int r5 = num4 % num3;//나머지를 구하는 연산자
	
	
	System.out.println("r1 : "+r1);
	System.out.println("r2 : "+r2);
	System.out.println("r3 : "+r3);
	System.out.println("r4 : "+r4);
	
	//증감연산자
	int num =0;
	
	num++;
	++num;
	
	System.out.println("num :"+num);
	
	num--;
	--num;
	System.out.println("num : "+num);
	
	
	//복합대입연산자
	int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
	
	n1 += 1;//n1 = n1 + 1
	n2 -= 2;//n2 = n2 - 2
	n3 *= 3;//n3 = n3 * 3
	n4 /= 4;//n4 = n4 / 4
	
	System.out.println("n1 : "+n1);
	System.out.println("n2 : "+n2);
	System.out.println("n3 : "+n3);
	System.out.println("n4 : "+n4);
	
	//비교연산자
	int var1 = 1;
	int var2 = 2;
	
	boolean rs1 = var1 > var2;//var1은 var2보다 크다
	boolean rs2 = var1 < var2;//var1은 var2보다 작다
	boolean rs3 = var1 >= var2;//var1은 var2보다 크거나 작다
	boolean rs4 = var1 <= var2;//var1은 var2보다 작거나 같다
	boolean rs5 = var1 == var2;//var1은 var2보다 서로 같다
	boolean rs6 = var1 != var2;//var1은 var2보다 서로 다르다
	
	System.out.println("rs1 : "+rs1);
	System.out.println("rs2 : "+rs2);
	System.out.println("rs3 : "+rs3);
	System.out.println("rs4 : "+rs4);
	System.out.println("rs5 : "+rs5);
	System.out.println("rs6 : "+rs6);
	
	
	//논리연산자
	int var3 = 3;
	int var4 = 4;
	
  boolean rs11 = (var3 > 3)&& (var4>3);//var3은 3보다 크고 그리고 var4는 3보다 크다
  boolean rs22 = (var3 > 2)&& (var4>3);//var3은 2보다 크고 그리고 var4는 3보다 크다
  boolean rs33 =(var3 > 3)&& (var4>3);//var3은 3보다 크고 그리고 var4는 3보다 크다
  
  System.out.println("rs11 : "+rs11);
  System.out.println("rs22 : "+rs22);
  System.out.println("rs33 : "+rs33);
		
		
}
}
