package Model;

public class School implements Student{

	private String name;
	private String emailId;
	private int age;
	
	public School(String name, String emailId, int age) {
//		super();
		this.name = name;
		this.emailId = emailId;
		this.age = age;
	}

	@Override
	public String getName() {
		
		return name;
		
	}

	@Override
	public int getAge() {
		
		return age;
		
	}

	@Override
	public String getEmai() {
		
		return emailId;
		
	}

}
