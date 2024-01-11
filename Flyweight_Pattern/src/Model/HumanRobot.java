package Model;

public class HumanRobot implements IRobot{
	
	private String type;
	private Sprites body;
	
	HumanRobot(String type, Sprites body){
		this.type = type;
		this.body = body;
	}
	
	public String getType() {
		return type;
	}
	
	public Sprites getBody() {
		return body;
	}
	
	@Override
	public void display(int x, int y) {
		
		System.out.println("Human Robot at " + x + ", " + y);
		
	}

}
