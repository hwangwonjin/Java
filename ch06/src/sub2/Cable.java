package sub2;

public class Cable implements Socket {

	
	private Bulb bulb;
	private int num;
	
	public Cable(Bulb bulb, int num) {
		this.bulb =bulb;
		this.num = num;
	}
	
	
	
	@Override
	public void swichon() {
		bulb.lighton();
		
	}

	@Override
	public void swichoff() {
		bulb.lightoff();
		
	}

	
	
	
}
