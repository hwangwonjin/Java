package sub1;

public class car {
	
	
	//속성
	String name;
	String Color;
	int speed;
	
	
	//기능
	public void speedUp(int speed) {
		
		this.speed += speed;
	
	}
	public void speedDown(int speed) { 
		this.speed -= speed;
	}
	public void show() { 
		System.out.println("차량명 : " +name);
		System.out.println("차량색 : " +Color);
		System.out.println("현재속도 : " +speed);
	}
	
	
}
