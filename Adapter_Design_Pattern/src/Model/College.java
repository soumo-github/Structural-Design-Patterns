package Model;

public class College {

	private String name;
	private String emailId;
	private int age;
	
	public College(String name, String emailId, int age) {
//		super();
		this.name = name;
		this.emailId = emailId;
		this.age = age;
	}

	public String getName() {
		
		return name;
		
	}

	public int getAge() {
		
		return age;
		
	}

	public String getEmai() {
		
		return emailId;
		
	}
}
