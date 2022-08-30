package sub5;

public class Truck extends car {
	
	
	
	private int capacity;
	

	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}
	public void load(int capacity) {
		this.capacity +=20;
	}
	public void show() {
		System.out.println("트럭명 : "+name);
		System.out.println("트럭색 : "+Color);
		System.out.println("트럭속도 : "+speed);
		System.out.println("적재량 : "+capacity);
	}
	
	
}
