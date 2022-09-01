package sub2;

public class Cable implements Socket {

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb =bulb;
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
