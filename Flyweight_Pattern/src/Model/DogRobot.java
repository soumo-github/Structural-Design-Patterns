package Model;

public class DogRobot implements IRobot{

	private String type;
	private Sprites body;
	
	DogRobot(String type, Sprites body){
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

		System.out.println("Dog Robot at " + x + ", " + y);
		
	}

}
