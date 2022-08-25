package sub2;

public class car {
	
	
	//속성
	private String name;
	private String Color;
	private int speed;
	
	//생성자
	 public car(String name, String Color, int speed) {
		 this.name = name;
		 this.Color = Color;
		 this.speed = speed;
	 }
	
	//Getter, Setter
	 public String getName() {
		return name;
	}
	 public void setName(String name) {
		this.name = name;
	}
	 
	 public String getColor() {
		return Color;
	}
	 public void setColor(String color) {
		Color = color;
	}
	 
	 public int getSpeed() {
		return speed;
	}
	 public void setSpeed(int speed) {
		this.speed = speed;
	}
	 
	
	//기능
	public void speedUp(int speed) {
		
		this.speed += speed;
	
	}
	public void speedDown(int speed) { 
		this.speed -= speed;
	}
	public void show() { 
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + Color);
		System.out.println("현재속도 : " + speed);
	}
	
	
}
